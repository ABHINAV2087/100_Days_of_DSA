
import java.util.*;
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
         while  (startrow <= endrow && startcol <= endcol){
            // top
            for(int i = startcol;i<=endcol;i++){
                ans.add(matrix[startrow][i]);
            }

            // right
            for(int i = startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }

            // bottom
            for(int i=endcol -1;i>=startcol;i--){
                if(startrow == endrow){
                    break;
                }
                ans.add(matrix[endrow][i]);
            }

            // left
            for(int i = endrow - 1;i>=startrow+1 ;i--){
                if(startcol == endcol){
                    break;
                }
                ans.add(matrix[i][startcol]);
            }
            startrow++;startcol++;endrow--;endcol--;
        }
        return ans;
    }
}
