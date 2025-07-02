import java.util.*;

public class twosum {

  // ✅ 1. Optimal HashMap Approach (Best for interviews)
  public static int[] twoSumHashMap(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }

      map.put(nums[i], i);
    }

    return new int[] {}; // No pair found
  }

  // ❌ 2. Brute Force Approach
  public static int[] twoSumBruteForce(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }

    return new int[] {}; // No pair found
  }

  // ✅ 3. Two Pointers Approach (Only to check if pair exists)
  public static String twoSumCheck(int[] nums, int target) {
    Arrays.sort(nums); // Sort the array

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];

      if (sum == target) {
        return "YES";
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }

    return "NO";
  }

  // Main method
  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 9;

    // HashMap approach
    int[] result1 = twoSumHashMap(nums, target);
    System.out.println("HashMap Result (Indices): " + Arrays.toString(result1));
    /*
     * if we print normal array they will give addres not value so i converted into
     * a string.
     */

    // Brute Force approach
    int[] result2 = twoSumBruteForce(nums, target);
    System.out.println("Brute Force Result (Indices): " + Arrays.toString(result2));

    // Two Pointer approach
    String result3 = twoSumCheck(nums.clone(), target);
    System.out.println("Two Pointer Result (YES/NO): " + result3);
  }
}
