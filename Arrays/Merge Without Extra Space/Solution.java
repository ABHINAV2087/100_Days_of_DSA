/* Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without 
using any extra space. 
Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements. 

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
2 2 3 4
7 10

*/

class Solution {
    // solution in java 
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int left = n - 1;
        int right = 0;

      while (left >= 0 && right < m) {
         if (a[left] > b[right]) {
         int temp = a[left];
         a[left] = b[right];
         b[right] = temp;
         left--;
         right++;
    } else {
        break;
    }
}

// No need to sort arrays again if they were already sorted
Arrays.sort(a);
Arrays.sort(b);

        
    }
}