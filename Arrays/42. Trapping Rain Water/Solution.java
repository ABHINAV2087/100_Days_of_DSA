

class Solution {
    public int trap(int[] height) {
        int n = height.length;

        // Arrays to store the max height to the left and right of each bar
        int[] leftMaxBoundary = new int[n];
        int[] rightMaxBoundary = new int[n];

        // Initialize the first value of leftMaxBoundary
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i - 1]);
        }

        // Initialize the last value of rightMaxBoundary
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }

        // Calculate the total trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}
