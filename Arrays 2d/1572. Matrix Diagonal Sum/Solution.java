

public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ;
        int n = mat.length;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         if(i==j){
        //             sum += mat[i][j];
        //         }
        //         else if(i+j == n-1){
        //             sum += mat[i][j];
        //         }
        //     }
        // }
        // return sum;

      
        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Primary diagonal
        if (i != n - 1 - i) {
            sum += mat[i][n - 1 - i]; // Secondary diagonal
         }
    }
        return sum;

    }
}
