public class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }

        ArrayList<Integer> ans = new ArrayList<>(set); 
        Collections.sort(ans);
        return ans;
    }
}
public class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int j = 0; j < b.length; j++) {
            set.add(b[j]);
        }

        ArrayList<Integer> ans = new ArrayList<>(set); 
        Collections.sort(ans);
        return ans;
    }
}