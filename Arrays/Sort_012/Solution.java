/* Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
Output : [1, 3, 2, 11, 6, -1, -7, -5]

 */

class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];
        
        int index = 0;
        
        for (int i = 0; i<n;i++){
            if(arr[i] >= 0 ){
                a[index] = arr[i];
                index++;
            }
        }
        
        for (int i = 0; i<n;i++){
            if(arr[i] < 0 ){
                a[index] = arr[i];
                index++;
            }
        }
        
        for (int i = 0; i<n;i++){
            arr[i] = a[i];
        }
        
    }
}