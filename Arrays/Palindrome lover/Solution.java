
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int i = 1; i <= test; i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            // Transform array elements to 0s and 1s
            for(int j = 0; j < size; j++){
                int temp = sc.nextInt();
                arr[j] = temp % 2;
            }
            
            // Count frequency of 0s and 1s
            int count0 = 0, count1 = 0;
            for(int j = 0; j < size; j++){
                if(arr[j] == 0){
                    count0++;
                } else {
                    count1++;
                }
            }
            
            // Check if palindrome can be formed
            // At most one value can have odd frequency
            int oddCount = 0;
            if(count0 % 2 == 1) oddCount++;
            if(count1 % 2 == 1) oddCount++;
            
            if(oddCount <= 1){
                System.out.println(1); // YES - can form palindrome
            } else {
                System.out.println(0); // NO - cannot form palindrome
            }
        }
    }
}
