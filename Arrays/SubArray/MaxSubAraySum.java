

// brute force approach

public class Subarrays {

    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
       
        System.out.println("Max Subarray Sum: " + maxSubarraySum(arr));
    }
}


// Prefix sum approach  


public class Subarrays {

    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        // Create prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Try all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Max Subarray Sum (Prefix Sum): " + maxSubarraySum(arr));
    }
}
