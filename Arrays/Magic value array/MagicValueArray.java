import java.util.*;

public class MagicValueArray {
    public static int magicValue(int n, int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        int goodSum = 0, badSum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == sortedArr[i]) {
                goodSum += arr[i];
            } else {
                badSum += arr[i];
            }
        }

        return goodSum - badSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input elements of array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Compute and print magic value
        System.out.println(magicValue(n, arr));

        sc.close();
    }
}
