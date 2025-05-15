

class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE; // Initially very high so that any price will be lower
        int maxprofit = 0; // Initially no profit

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) { // Potential sell
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit); // Update max profit
            } else {
                buyprice = prices[i]; // Update to lower buy price
            }
        }
        return maxprofit;

    }
}