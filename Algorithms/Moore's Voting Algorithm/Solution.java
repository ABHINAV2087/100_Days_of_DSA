

public class Solution {
    public int majorityElement(int[] nums) {
        int majorityElem = nums[0]; 
        int votes = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]==majorityElem){
                votes++;
            }else if(votes == 0){
                majorityElem = nums[i];
            }else{
                votes--;
            }
        }

        return majorityElem ;
    }
}
