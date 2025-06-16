class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
             return false;
            }

        int rowIdx = searchPotentialRow(matrix,target) ;
        if(rowIdx != -1){
            return binarySearchOverRow(rowIdx,matrix,target);
        }
        else return false;
    }
    public int searchPotentialRow(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[mid][0] <= target && matrix[mid][matrix[0].length - 1] >= target){
                return mid;
            }
            else if(matrix[mid][0] < target){
                low = mid + 1 ;
            }else if(matrix[mid][0] > target){
                high = mid-1;
            }
        } 
        return -1;
    }
public boolean binarySearchOverRow(int rowIdx, int[][] matrix, int target){
    int low = 0;
    int high = matrix[rowIdx].length - 1;

    while(low <= high){
        int mid = low + (high - low) / 2;

        if(matrix[rowIdx][mid] == target){
            return true;
        }
        else if(matrix[rowIdx][mid] < target){
            low = mid + 1;  // ✅ Go right
        }
        else {
            high = mid - 1; // ✅ Go left
        }
    }
    return false;
}

}