

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
        int m = matrix[0].length;
        int row =0; int col =m-1;
        while(row<n && col>=0){
            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) row++;
            else col--;
        }
    
  return  false;
    }
}


class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (binarySearch(i, matrix, target)) {
                return true;
            }
        }
        return false; // target not found in any row
    }

    public boolean binarySearch(int i, int[][] matrix, int target) {
        int low = 0;
        int high = matrix[i].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[i][mid] == target) {
                return true;
            } else if (matrix[i][mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
