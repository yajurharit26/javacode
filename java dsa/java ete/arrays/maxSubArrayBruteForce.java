package arrays;
class Solution {
    public int maxSubArrayBruteForce(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest value

        // Loop over each starting point of the subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // Loop over each ending point for the current subarray
            for (int j = i; j < n; j++) {
                currentSum += arr[j]; // Add the current element to the sum
                maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sol.maxSubArrayBruteForce(arr)); // Output: 6
    }
}
