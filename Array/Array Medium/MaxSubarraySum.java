public class MaxSubarraySum { // KADANE'S ALGORITHM

    // Brute Force Method - O(N^2)
    public static int maxSubarrayBrute(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += nums[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }

    // Optimal Method (Kadane's Algorithm) - O(N)
    public static int maxSubarrayKadane(int[] nums) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            maxsum = Math.max(maxsum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxsum;
    }

    // Main Method to Test
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println("Brute Force Result: " + maxSubarrayBrute(nums));
        System.out.println("Kadane's (Optimal) Result: " + maxSubarrayKadane(nums));
    }
}
