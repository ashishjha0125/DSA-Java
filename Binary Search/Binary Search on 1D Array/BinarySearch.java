public class BinarySearch {

  // Iterative Binary Search using low and high
  public static int binarySearchIterative(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target)
        return mid;

      if (arr[mid] < target)
        low = mid + 1; // Move to right half
      else
        high = mid - 1; // Move to left half
    }

    return -1; // Target not found
  }

  // Recursive Binary Search using low and high
  public static int binarySearchRecursive(int[] arr, int low, int high, int target) {
    if (low > high)
      return -1; // Base condition

    int mid = low + (high - low) / 2;

    if (arr[mid] == target)
      return mid;

    if (arr[mid] < target)
      return binarySearchRecursive(arr, mid + 1, high, target);
    else
      return binarySearchRecursive(arr, low, mid - 1, target);
  }

  // Main method to test both functions
  public static void main(String[] args) {
    int[] arr = { 2, 4, 7, 10, 23, 31, 44, 59, 64, 78 };
    int target = 31;

    // Iterative call
    int iterativeIndex = binarySearchIterative(arr, target);
    System.out.println("Iterative Binary Search Index: " + iterativeIndex);

    // Recursive call
    int recursiveIndex = binarySearchRecursive(arr, 0, arr.length - 1, target);
    System.out.println("Recursive Binary Search Index: " + recursiveIndex);
  }
}
