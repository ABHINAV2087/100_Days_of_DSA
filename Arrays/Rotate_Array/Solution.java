

// Rotate array clockwise by 1 

class Solution {

    public void rotate(int[] arr) {
       
       
       int temp = arr[arr.length-1];
      
       for(int i = arr.length-1 ; i > 0;i--){
           arr[i] = arr[i-1];
           
       }
       arr[0] = temp;
       
    }
}

// rotate array clockwise by k position 

class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        int[] temp = new int[n];

        // Copy last k elements to the front
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Copy first n-k elements
        for (int i = 0; i < n - k; i++) {
            temp[k + i] = arr[i];
        }

        // Copy temp back to arr
        System.arraycopy(temp, 0, arr, 0, n);
    }
}
