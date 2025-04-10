
/* 

https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5. 



*/

package Minimize_the_Heights;

import java.util.Arrays;

public class Solution {
     public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if(n==0 || n==1) return 0;
        
        Arrays.sort(arr);
        int result = arr[n-1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        
        for(int i=0; i<n-1; i++) {
            int min = Math.min(smallest, arr[i+1] - k);
            int max = Math.max(largest, arr[i] + k);
            
            if(min < 0) continue;
            
            result = Math.min(result, max-min);
        }
        
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 15, 10};
        int k = 3;
        System.out.println("Minimum difference is: " + getMinDiff(arr, k));
    }
}
