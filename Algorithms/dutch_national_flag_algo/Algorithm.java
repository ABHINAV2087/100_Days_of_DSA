package Algorithms.dutch_national_flag_algo;

import java.util.Arrays;

public class Algorithm {
     public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) { // 0
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) { // 1
                mid++;
            } else { // 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] balls = {2, 0, 2, 1, 1, 0};
        System.out.println("Before sorting: " + Arrays.toString(balls));
        sortColors(balls);
        System.out.println("After sorting: " + Arrays.toString(balls));
    }
}


