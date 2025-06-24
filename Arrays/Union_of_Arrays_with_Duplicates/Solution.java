// Union of two arrays 

class Solution {
    public static int findUnion(int a[], int b[]) {
       Set<Integer> union = new HashSet<>();
       
       for(int i: a){
           union.add(i);
       }
       for(int i: b ){
           union.add(i);
       }
       
       return union.size();
    }
}

// Intersection of two arrays

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums2){
            set1.add(i);
        }

        for( int i = 0 ;i < nums1.length; i++){
            if(set1.contains(nums1[i])){
                list.add(nums1[i]);
                set1.remove(nums1[i]);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
