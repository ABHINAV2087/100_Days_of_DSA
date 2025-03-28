/* Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
 */

// optimal solution with time complexity of O(n) 

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
       int count0 = 0 , count1 = 0 ,count2 = 0;
       
       for(int i=0;i < arr.length;i++){
           if(arr[i] == 0) count0++;
           else if (arr[i] == 1) count1++;
           else count2++;
       }
       
       int index = 0;
       for (int i = 0; i<count0;i++ ){
           arr[index++] = 0;
       }
       for(int i = 0 ; i<count1;i++){
           arr[index++] = 1;
       }
       for(int i = 0 ; i<count2;i++){
           arr[index++] = 2;
       }
       
    }
}


// more optimized solution in single pass using dutch national flag algorithm

class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void swap(int[] arr, int i, int j){
        if (i != j) { // To avoid making both values zero if i == j
            int temp = arr[i]; 
            arr[i] = arr[j];    
            arr[j] = temp;   
        }
    }
    public void sort012(int[] arr) {
       int low = 0, mid = 0 , high = arr.length-1;
       
       while(mid<=high){
           if(arr[mid] == 0 ){
               swap(arr, low, mid);
               low++;
               mid++;
           }
           else if (arr[mid] == 1){
               mid++;
           }
           else{
               swap(arr,mid,high);
               high--;
           }
       }
    }
}