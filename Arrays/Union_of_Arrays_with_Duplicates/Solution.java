// Union of two arrays 

class Solution {
    public static int findUnion(int a[], int b[]) {
      HashSet<Integer> union = new HashSet<>();
      
      for(int i=0;i<a.length;i++){
        union.add(a[i]);
      }
      for(int i=0;i<b.length;i++){
        union.add(b[i]);
      }
     return union.size();
      
    }
}

// Intersection of two arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        //Add all elements to set from array 1
        for(int i =0; i< nums1.length; i++) set.add(nums1[i]);
        for(int j = 0; j < nums2.length; j++) {
           // If present in array 2 then add to res and remove from set 
           if(set.contains(nums2[j])) {
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        // Convert ArrayList to array
        int[] arr = new int[res.size()];
        for (int i= 0; i < res.size(); i++) arr[i] = res.get(i);
        return arr;
    }
}