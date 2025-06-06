/* https://leetcode.com/problems/plus-one/

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]

Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4]. 

*/

package Plus_One;

public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length ;

        for(int i = n-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]= 0;
            }
            else {
                digits[i]++;
                return digits;
            }
        }

        digits = new int[n+1];
        digits[0] = 1;

        return digits;
         

        
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
