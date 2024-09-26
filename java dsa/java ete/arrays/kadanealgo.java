package arrays;
class kadanealgo {
    public static int maxSubArrayKadane(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest value
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            // Update maxSum if currentSum is larger
            maxSum = Math.max(maxSum, currentSum);

            // If currentSum becomes negative, reset it to zero
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArrayKadane(arr)); // Output: 6
    }
}
