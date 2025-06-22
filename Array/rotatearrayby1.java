import java.util.Scanner;

public class rotatearrayby1 {

  public static void rotate(int array[], int n) {
    int temp = array[0]; // Store the first element
    for (int i = 1; i < n; i++) {
      array[i - 1] = array[i]; // Shift elements to the left
    }
    array[n - 1] = temp; // Place the first element at the end
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
    rotate(array, size);

    for (int j = 0; j < size; j++) {
      System.out.print(array[j] + " "); // Print the array elements
    }

  }
}
// This code rotates the array by one position to the left.
// The first element is moved to the end, and all other elements are shifted
// left by one
