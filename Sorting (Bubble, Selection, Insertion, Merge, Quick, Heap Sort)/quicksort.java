import java.util.Scanner;

public class quicksort {

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

  public static int partition(int array[], int low, int high) {

    int pivort = array[low]; // Choosing the first element as the pivot
    int i = low;
    int j = high;

    while (i < j) {
      while (i <= high && array[i] <= pivort) {
        i++;

      }
      while (j >= low && array[j] > pivort) {
        j--;

      }
      if (i < j) {
        // Swap the elements at i and j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[low];
    array[low] = array[j];
    array[j] = temp; // Place the pivot in its correct position

    return j;
  }

  public static void quicksorts(int array[], int low, int high) {
    if (low < high) {
      int pivotIndex = partition(array, low, high); // Partition the array
      quicksorts(array, low, pivotIndex - 1); // Recursively sort the left part
      quicksorts(array, pivotIndex + 1, high); // Recursively sort the right part
    }
  }

  public static void main(String[] args) {
    int array[] = array();// Calling the method to create an array and store it in a variable
    // Calling the method to print the elements of the array
    printarray(array);// This will print the elements of the array
    System.out.println(); // Print a new line for better readability
    quicksorts(array, 0, array.length - 1); // Sort the array using quicksort
    printarray(array); // This will print the sorted elements of the array

  }

}
