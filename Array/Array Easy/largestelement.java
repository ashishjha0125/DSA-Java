import java.util.Arrays;
import java.util.Scanner;

public class largestelement {

  public static int brutmethod(int array[], int n) {// timecomplexity O(nlogn) and space complexity O(1)
    Arrays.sort(array);
    int largest = array[n - 1];

    return largest;
  }

  public static int optimisedmethod(int array[], int n) {// timecomplexity O(n) and space complexity O(1)
    int largest = array[0];
    for (int i = 0; i < n; i++) {
      if (array[i] > largest) {
        largest = array[i];
      }
    }

    return largest;
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

    int largest = brutmethod(array, size); // Calling the method to find the largest element
    // Output the largest element
    System.out.println("The largest element in the array using Brut Force is: " + largest);

    int largestOptimised = optimisedmethod(array, size); // Calling the optimised method
    System.out.println("The largest element in the array using optimised method is: " + largestOptimised);
    sc.close(); // Close the scanner to prevent resource leaks
  }
}
