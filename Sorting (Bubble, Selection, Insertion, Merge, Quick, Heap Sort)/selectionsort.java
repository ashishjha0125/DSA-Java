import java.util.Scanner;

public class selectionsort {

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

  // this function is used for selection sort
  public static int[] selectionsorts(int array[]) {

    int n = array.length;

    for (int i = 0; i <= n - 2; i++) {// Loop through the array to find the minimum element
      // in the unsorted part of the array
      int minindex = i;// Assume the first element is the minimum
      // Find the index of the minimum element in the unsorted part
      for (int j = i; j < n - 1; j++) {// Loop through the unsorted part of the array
        // If the current element is smaller than the current minimum, update minindex
        if (array[j] < array[minindex]) {// Compare the current element with the minimum element
          // If the current element is smaller, update minindex
          minindex = j;

        }
        // Swap the found minimum element with the first element of the unsorted part
        int temp = array[minindex];
        array[minindex] = array[i];
        array[i] = temp;
      }

    }

    return array; // Return the sorted array

  }

  public static void main(String[] args) {
    int array[] = array();// Calling the method to create an array and store it in a variable

    // Calling the method to print the elements of the array
    printarray(array);// This will print the elements of the array
    System.out.println(); // Print a new line for better readability

    int sortedarray[] = selectionsorts(array);
    printarray(sortedarray); // This will print the sorted elements of the array
    System.out.println(); // Print a new line for better readability

  }
}