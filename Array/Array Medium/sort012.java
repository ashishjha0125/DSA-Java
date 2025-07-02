import java.util.Arrays;

public class sort012 {

  // ✅ 1. Brute Force: Use built-in sort (O(n log n))
  public static void sortBrute(int[] arr) {
    Arrays.sort(arr); // Java's in-built TimSort
  }

  // ✅ 2. Better Approach: Count frequency and overwrite (O(n))
  public static void sortBetter(int[] arr) {
    int count0 = 0, count1 = 0, count2 = 0;

    // Count 0s, 1s, and 2s
    for (int num : arr) {
      if (num == 0)
        count0++;
      else if (num == 1)
        count1++;
      else
        count2++;
    }

    // Overwrite the original array
    int index = 0;

    for (int i = 0; i < count0; i++)
      arr[index++] = 0;
    for (int i = 0; i < count1; i++)
      arr[index++] = 1;
    for (int i = 0; i < count2; i++)
      arr[index++] = 2;
  }

  // ✅ 3. Optimal: Dutch National Flag Algorithm (O(n), in-place)
  public static void sortOptimal(int[] arr) {
    int low = 0;
    int mid = 0;
    int high = arr.length - 1;

    while (mid <= high) {
      if (arr[mid] == 0) {
        int temp = arr[low];
        arr[low] = arr[mid];
        arr[mid] = temp;
        low++;
        mid++;
      } else if (arr[mid] == 1) {
        mid++;
      } else { // arr[mid] == 2
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;
        high--;
      }
    }
  }

  // Utility to print array
  public static void printArray(int[] arr) {
    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();
  }

  // 🔧 Main method for testing all three
  public static void main(String[] args) {
    int[] original = { 2, 0, 2, 1, 1, 0 };

    // Brute Force
    int[] arr1 = original.clone();
    sortBrute(arr1);
    System.out.print("Brute Sorted:   ");
    printArray(arr1);

    // Better
    int[] arr2 = original.clone();
    sortBetter(arr2);
    System.out.print("Better Sorted:  ");
    printArray(arr2);

    // Optimal
    int[] arr3 = original.clone();
    sortOptimal(arr3);
    System.out.print("Optimal Sorted: ");
    printArray(arr3);
  }
}
