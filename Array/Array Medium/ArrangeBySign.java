import java.util.Arrays;

public class ArrangeBySign {

  // Brut Force — uses two extra arrays
  public static int[] rearrangeBySign(int[] array) {
    int n = array.length;

    int[] positivearray = new int[n / 2];
    int posIndex = 0;
    int[] negativearray = new int[n / 2];
    int negIndex = 0;

    for (int i = 0; i < n; i++) {
      if (array[i] >= 0) {
        positivearray[posIndex] = array[i];
        posIndex++;
      } else {
        negativearray[negIndex] = array[i];
        negIndex++;
      }
    }

    for (int i = 0; i < n / 2; i++) {
      array[i * 2] = positivearray[i];
      array[i * 2 + 1] = negativearray[i];
    }

    return array;
  }

  // Optimized Version single traversal, space-efficient
  public static int[] rearrangeBySignOptimized(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];
    int posIndex = 0;
    int negIndex = 1;

    for (int i = 0; i < n; i++) {
      if (nums[i] >= 0) {
        result[posIndex] = nums[i];
        posIndex += 2;
      } else {
        result[negIndex] = nums[i];
        negIndex += 2;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] array = { -7, 1, 5, 3, -6, -4 };

    // Original Version
    int[] originalOutput = rearrangeBySign(array.clone());
    System.out.println("BrutForce Output: " + Arrays.toString(originalOutput));

    // Optimized Version
    int[] optimizedOutput = rearrangeBySignOptimized(array.clone());
    System.out.println("Optimized Version Output: " + Arrays.toString(optimizedOutput));
  }
}
