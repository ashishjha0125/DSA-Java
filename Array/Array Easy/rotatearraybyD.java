import java.util.Scanner;

public class rotatearraybyD {

  public static void rotate(int array[], int n, int d) { // time complexity
    // O(n*d) Brut Force
    // // Function to rotate the array by d positions

    while (d > 0) {
      int temp = array[0]; // Store the first element
      for (int i = 1; i < n; i++) {
        array[i - 1] = array[i]; // Shift elements to the left
      }
      array[n - 1] = temp; // Place the first element at the end
      d--;
    }

  }

  public static void rotatetemparray(int array[], int n, int d) { // Function to rotate the array by d positions using a
                                                                  // temporary array
    int temp[] = new int[d]; // Create a temporary array to hold the first d elements
    for (int i = 0; i < d; i++) {
      temp[i] = array[i]; // Store the first d elements in the temporary array
    }

    for (int i = 0; i < n - d; i++) {
      array[i] = array[i + d]; // Shift the remaining elements to the left
    }

    for (int i = 0; i < d; i++) {
      array[n - d + i] = temp[i]; // Place the elements from the temporary array at the end
    }
  }

  public static void reverse(int array[], int start, int end) {
    // Function to reverse the elements of the array from start to end
    while (start < end) {
      int temp = array[start]; // Store the element at start
      array[start] = array[end]; // Swap the elements at start and end
      array[end] = temp; // Place the stored element at end
      start++; // Move start forward
      end--; // Move end backward
    }
  }

  public static void rotatebyreverse(int array[], int size, int d) {
    // Function to rotate the array by d positions using the reverse method
    reverse(array, 0, d - 1); // Reverse the first d elements
    reverse(array, d, size - 1); // Reverse the remaining elements
    reverse(array, 0, size - 1); // Reverse the entire array
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
    int d;
    System.out.println("Enter the number of positions to rotate: ");
    d = sc.nextInt(); // Input the number of positions to rotate

    rotate(array, size, d);// Rotate the array by d positions using the first
    // method
    for (int j = 0; j < size; j++) {
      System.out.print(array[j] + " "); // Print the array elements
    }
    System.out.println("<---Now Running Temp Array Method");
    System.out.println("Enter the size of the array: ");
    int size1 = sc.nextInt(); // Input the size of the array
    int array1[] = new int[size1];

    for (int i = 0; i < size1; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      array1[i] = sc.nextInt(); // Input each element of the array
    }

    int d1;
    System.out.println("Enter the number of positions to rotate: ");
    d1 = sc.nextInt(); // Input the number of positions to rotate

    rotatetemparray(array1, size1, d1);// Rotate the array by d positions using the temporary array method
    for (int j = 0; j < size1; j++) {
      System.out.print(array1[j] + " "); // Print the array elements
    }

    System.out.println("<---Now Running Reverse the Array Method");
    System.out.println("Enter the size of the array: ");
    int size2 = sc.nextInt(); // Input the size of the array
    int array2[] = new int[size2];

    for (int i = 0; i < size2; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      array2[i] = sc.nextInt(); // Input each element of the array
    }

    int d2;
    System.out.println("Enter the number of positions to rotate: ");
    d2 = sc.nextInt(); // Input the number of positions to rotate

    rotatebyreverse(array2, size2, d2);// Rotate the array by d positions using the temporary array method
    for (int j = 0; j < size2; j++) {
      System.out.print(array2[j] + " "); // Print the array elements
    }
    sc.close(); // Close the scanner to avoid resource leaks
  }
}