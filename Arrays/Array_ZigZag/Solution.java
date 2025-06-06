/* 

Given an array arr of distinct elements, the task is to rearrange the elements of the array in a zig-zag fashion so that the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

Note: Modify the given arr[] only, If your transformation is correct, the output will be "true" else the output will be "false". 


Input: arr[] = [4, 3, 7, 8, 6, 2, 1]
Output: true
Explanation:  After modification the array will look like 3 < 7 > 4 < 8 > 2 < 6 > 1, the checker in the driver code will produce 1. 

*/

package Array_ZigZag;

public class Solution {
    public static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    // public static void zigZag(int[] arr) {
    //     int flag = 0;
        
    //     for(int i = 0 ; i<arr.length-1; i++){
    //         if(flag == 0 && arr[i] > arr[i+1]){
    //             swap(arr,i,i+1);
    //             flag = 1;
    //         }else if(flag == 1 && arr[i] < arr[i+1]){
    //             swap(arr,i,i+1);
    //             flag = 0;
    //         }
    //     }
    // }
    
    public static void zigZag(int[] arr) {
        // true means arr[i] < arr[i+1], false means arr[i] > arr[i+1]
        boolean less = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (less) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            less = !less; // flip the expectation for the next pair
        }
    }
}
