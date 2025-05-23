class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] result = new int[Math.min(n,m)];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0,j=0,count = 0;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                result[count++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return Arrays.copyOfRange(result, 0, count);
    }
}
