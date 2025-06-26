public class missingnumber {

  /**
   * Brute-force approach using linear search.
   * Time Complexity: O(n^2)
   * Space Complexity: O(1)
   */
  public static int linearSearchMethod(int[] array, int n) {
    for (int i = 1; i <= n + 1; i++) {
      boolean found = false;
      for (int j = 0; j < n; j++) {
        if (array[j] == i) {
          found = true;
          break;
        }
      }
      if (!found) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Better approach using hashing/frequency array.
   * Time Complexity: O(n)
   * Space Complexity: O(n)
   */
  public static int hashingMethod(int[] array, int n) {
    int[] hash = new int[n + 2]; // to handle up to n+1

    for (int num : array) {
      hash[num]++;
    }

    for (int i = 1; i <= n + 1; i++) {
      if (hash[i] == 0) {
        return i;
      }
    }

    return -1;
  }

  /**
   * Optimal approach using mathematical summation formula.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int optimalMissingNumber(int[] array, int n) {
    int expectedSum = (n + 1) * (n + 2) / 2;
    int actualSum = 0;

    for (int num : array) {
      actualSum += num;
    }

    return expectedSum - actualSum;
  }

  /**
   * XOR-based optimal approach.
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public static int optimalXOR(int[] array, int n) {
    int xorFull = 0; // XOR of all numbers from 1 to n+1
    int xorArray = 0; // XOR of all elements in array

    for (int i = 1; i <= n + 1; i++) {
      xorFull ^= i;
    }

    for (int i = 0; i < n; i++) {
      xorArray ^= array[i];
    }

    return xorFull ^ xorArray;
  }

  /**
   * Main method to run all test cases.
   */
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 6, 7, 8, 9 }; // Missing 5
    int n = array.length;

    int number1 = linearSearchMethod(array, n);
    System.out.println("🔹 Missing number using Brute Force: " + number1);

    int number2 = hashingMethod(array, n);
    System.out.println("🔹 Missing number using Hashing: " + number2);

    int number3 = optimalMissingNumber(array, n);
    System.out.println("🔹 Missing number using Sum Formula: " + number3);

    int number4 = optimalXOR(array, n);
    System.out.println("🔹 Missing number using XOR Method: " + number4);
  }
}
