public class OccurOnesAmongPairs {

  /**
   * Brute-force approach using nested loops.
   * Finds the number that occurs only once when all others appear twice.
   *
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static int linearsearch(int[] array, int n) {
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (array[i] == array[j])
          count++;
      }
      if (count == 1) {
        return array[i]; // Return the number that appears only once
      }
    }
    return -1; // No unique number found
  }

  /**
   * Hashing approach using frequency array.
   * Works only for non-negative integers.
   *
   * Time Complexity: O(n + maxi)
   * Space Complexity: O(maxi)
   */
  public static int hashingmethod(int[] array, int n) {
    int maxi = array[0];

    // Find the maximum value in the array
    for (int i = 0; i < n; i++) {
      maxi = Math.max(array[i], maxi);
    }

    // Create a frequency array of size (maxi + 1)
    int[] hash = new int[maxi + 1];

    // Count frequency of each number
    for (int num : array) {
      hash[num]++;
    }

    // Find the number that occurred exactly once
    for (int i = 0; i <= maxi; i++) {
      if (hash[i] == 1) {
        return i;
      }
    }

    return -1; // No unique number found
  }

  /**
   * Optimal XOR approach.
   * Uses the property that a^a = 0 and a^0 = a.
   *
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int uniqueAmongPairs(int[] array, int n) {
    int xor = 0;

    // XOR all elements; duplicates cancel out
    for (int num : array) {
      xor = xor ^ num;
    }

    return xor; // Remaining value is the unique number
  }

  /**
   * Main method to test all three approaches.
   */
  public static void main(String[] args) {

    // Test array where one element (2) occurs once, others twice
    int[] array = { 4, 3, 5, 4, 2, 3, 5 };
    int n = array.length;

    int number1 = linearsearch(array, n);
    System.out.println("The Number which occurs once using Linear Search is: " + number1);

    int number2 = hashingmethod(array, n);
    System.out.println("The Number which occurs once using Hashing Method is: " + number2);

    int number3 = uniqueAmongPairs(array, n);
    System.out.println("The Number which occurs once using XOR is: " + number3);

  }
}
