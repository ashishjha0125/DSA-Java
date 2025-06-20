import java.util.Arrays;
import java.util.Scanner;

public class secondlargest {

  public static int brutmethod(int array[], int n) {// time complexity O(n log n) and space complexity O(1)
    Arrays.sort(array);
    int max = array[n - 1];
    int i;
    for (i = n - 2; i >= 0; i--) {
      if (array[i] != max) {
        return array[i]; // Return the second largest element
      }

    }

    return array[i];
  }

  public static int optimisedmethod(int array[], int n) { // time complexity O(n) and space complexity O(1)
    // This method finds the second largest element in a single pass through the
    // array
    if (n < 2) {
      return -1; // If there are less than 2 elements, return -1
    }

    int largest = Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      if (array[i] > largest) {
        secondlargest = largest; // Update second largest
        largest = array[i];
      } else if (array[i] > secondlargest && array[i] != largest) {
        secondlargest = array[i]; // Update second largest if current element is not equal to largest

      }
    }
    return secondlargest; // Return the second largest element
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

    int secondlargest = brutmethod(array, size);
    // Output the second largest element
    System.out.println("The second largest element in the array using Brut Force is: " + secondlargest);

    int secondlargestOptimised = optimisedmethod(array, size); // Calling the optimised method
    System.out.println("The second largest element in the array using optimised method is: " + secondlargestOptimised);
    sc.close(); // Close the scanner to prevent resource leaks
  }
}
