public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;

        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);

            if (count > majorityCount) {
                return num;
            }
        }

        return -1; 
    }
}