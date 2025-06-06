import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> finallist = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0){
                continue;
            }
            nums[index] *= -1;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                finallist.add(i+1);
            }
        }
        return finallist;
    }
}


// Approach 2 

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> finalList = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            arr[nums[i]] = nums[i];
        }
        for(int i = 1;i<arr.length;i++){
            if(arr[i]==0){
                finalList.add(i);
            }
        }
        return finalList;
    }
}