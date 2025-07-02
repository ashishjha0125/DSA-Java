import java.util.Scanner;

public class checksort {

  public static boolean isSorted(int array[], int n) {
    for (int i = 0; i < n - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false; // If any element is greater than the next, the array is not sorted
      }
    }

    return true; // If no such element is found, the array is sorted
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt(); // Input the size of the array
    int array[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      array[i] = sc.nextInt(); // Input each element of the array
    }

    if (isSorted(array, size)) {
      System.out.println("The array is sorted in ascending order.");
    } else {
      System.out.println("The array is not sorted in ascending order.");
    }
    sc.close(); // Close the scanner to prevent resource leaks

  }
}
