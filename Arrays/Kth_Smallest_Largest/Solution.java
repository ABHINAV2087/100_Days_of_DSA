// Given an array arr[] and an integer k where k is smaller than the size of the array, your task is to find the kth smallest element in the given array.

package Kth_Smallest_Largest;

public class Solution {
    public static int kthSmallest(int[] arr, int k) {
        if(arr.length == 1){
            return arr[0] ;
        }
        //sort the array with pivot technique
        int pivot = arr.length - 1;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < pivot ; j++) {
                if(arr[j] > arr[pivot]) {
                    int temp = arr[j];
                    arr[j] = arr[pivot];
                    arr[pivot] = temp;
                }
            }

            if(pivot > 0 ) pivot--;
        }

        return arr[k - 1];
    }
}
