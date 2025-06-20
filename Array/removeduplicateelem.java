import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class removeduplicateelem {

  public static int removeDuplicate(int array[], int n) {

    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    for (int num : array) {
      set.add(num); // Add each element to the set to remove duplicates
    }
    System.out.println("The elements in the set are: ");
    for (int num : set) {
      System.out.println(num);// Add each element to the set to remove duplicates
    }
    int index = 0;
    for (int num : set) {
      array[index++] = num; // Copy unique elements back to the array
    }

    return index;
  }

  public static int pointermethod(int array[], int n) {
    Arrays.sort(array);
    int i = 0;
    for (int j = 1; j < n; j++) {
      if (array[i] != array[j]) { // Check if the current element is different from the last unique element
        i++; // Move to the next position for a unique element
        array[i] = array[j]; // Update the array with the unique element
      }
    }
    return i + 1; // Return the new length of the array with unique elements
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

    int index = removeDuplicate(array, size); // Calling the method to remove duplicates
    System.out.println("Array after removing duplicates:");
    for (int i = 0; i < index; i++) {
      System.out.print(array[i] + " "); // Output the array after removing duplicates
      // Close the scanner to prevent resource leaks
    }

    int index2 = pointermethod(array, size); // Calling the pointer method to remove duplicates
    System.out.println("\nArray after removing duplicates using pointer method:");
    for (int i2 = 0; i2 < index2; i2++) {
      System.out.print(array[i2] + " "); // Output the array after removing duplicates using pointer method
    }
    sc.close(); // Close the scanner to prevent resource leaks
  }

}
