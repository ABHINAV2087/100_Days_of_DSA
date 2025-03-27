package Reverse_the_array;

public class Solution {

    public void reverseArray(int[] arr) {
        int j = arr.length - 1;
        int mid = arr.length / 2;

        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Solution solution = new Solution();
        solution.reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


/* 

optimized approach 

XOR Swapping

a = a ^ b
b = a ^ b
a = a ^ b

*/

/* 

class Solution {
    public void reverseArray(int arr[]) {
        int i = 0, j = arr.length - 1;  // Initialize two pointers:
                                        // - `i` starts from the beginning.
                                        // - `j` starts from the end.

        while (i < j) {                 // Continue until both pointers meet or cross.
            
            // Perform XOR swapping to swap arr[i] and arr[j] without using a temp variable.
            arr[i] ^= arr[j];           // Step 1: arr[i] = arr[i] ^ arr[j]
            arr[j] ^= arr[i];           // Step 2: arr[j] = arr[j] ^ arr[i] (which is now arr[i]^arr[j])
            arr[i] ^= arr[j];           // Step 3: arr[i] = arr[i] ^ arr[j] (which is now arr[j])

            i++;                        // Move `i` towards the right.
            j--;                        // Move `j` towards the left.
        }
    }
}


 */

 