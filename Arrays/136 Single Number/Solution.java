/* 

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 */

 import java.util.*;
public class Solution {
    public int singleNumber(int[] nums) {
         Arrays.sort(nums); // O(n log n)
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }
        return nums[nums.length - 1];
    }
}