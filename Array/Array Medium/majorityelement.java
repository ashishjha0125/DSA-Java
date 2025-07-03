import java.util.HashMap;

public class majorityelement {

    // 🔴 Brute Force: O(n^2)
    public static int majorityElementBrute(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    // 🟡 Better Approach: Using HashMap – O(n) Time, O(n) Space
    public static int majorityElementBetter(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int freq = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], freq);

            if (freq > n / 2) {
                return nums[i];
            }
        }

        return -1;
    }

    // 🟢 Optimal Approach: Moore’s Voting Algorithm – O(n) Time, O(1) Space
    public static int majorityElementOptimal(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Phase 1: Find candidate
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify candidate
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println("Brute Force Result: " + majorityElementBrute(nums));
        System.out.println("Better (HashMap) Result: " + majorityElementBetter(nums));
        System.out.println("Optimal (Moore's Voting) Result: " + majorityElementOptimal(nums));
    }
}
