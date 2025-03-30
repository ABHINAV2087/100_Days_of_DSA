//

class Solution {
    public static int findUnion(int a[], int b[]) {
      HashSet<Integer> sai=new HashSet<>();
      
      for(int i=0;i<a.length;i++){
          sai.add(a[i]);
      }
      for(int i=0;i<b.length;i++){
          sai.add(b[i]);
      }
     return sai.size();
      
    }
}