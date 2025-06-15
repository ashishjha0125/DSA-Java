import java.util.Scanner;

public class bubblesort {
  public static int[] array() { // Method to create an array and return it
    // This method will create an array of integers and return it
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int size = s.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the element in Array");
    for (int i = 0; i < size; i++) {
      arr[i] = s.nextInt();

    }
    s.close(); // Do not close Scanner if you plan to use System.in elsewhere
    return arr;
  }

  public static void printarray(int arr[]) {// Method to print the elements of the array
    // This method will print the elements of the array passed as an argument
    int size = arr.length;
    System.out.println("The elements in the array are:");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }

  }

  public static int[] bubblesorts(int array[]) {
    int n = array.length;
    for (int i = n - 1; i >= 0; i--) {
      boolean swapped = false;
      for (int j = 0; j < i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = temp;
          swapped = true;
        }
      }

      if (swapped == false) {
        break; // Agar koi swapping nahi hui toh array sorted hai, loop break karo
      }
    }
    return array;
  }

  public static void main(String[] args) {

    int array[] = array();// Calling the method to create an array and store it in a variable
    // Calling the method to print the elements of the array
    printarray(array);// This will print the elements of the array
    System.out.println(); // Print a new line for better readability

    int sortedarray[] = bubblesorts(array);
    printarray(sortedarray); // This will print the sorted elements of the array
    System.out.println(); // Print a new line for better readability
  }
}
