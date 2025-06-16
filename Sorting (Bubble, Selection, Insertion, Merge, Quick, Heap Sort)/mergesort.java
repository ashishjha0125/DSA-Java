import java.util.Scanner;
import java.util.ArrayList;

public class mergesort {

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

  // This function is used for merge sort
  public static void merge(int arr[], int low, int mid, int high) {

    ArrayList<Integer> temp = new ArrayList<>();// Temporary array to store merged elements
    int left = low;// Left index for the first half
    int right = mid + 1;// Right index for the second half

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {

        temp.add(arr[left]);// If the left element is smaller, add it to the temp array
        left++;// Move to the next element in the left half
      } else {
        temp.add(arr[right]);// If the right element is smaller, add it to the temp array
        right++;// Move to the next element in the right half
      }
    }
    // Add remaining elements from the left half if any
    while (left <= mid) {
      temp.add(arr[left]);// Add remaining left elements to the temp array
      left++;// Move to the next element in the left half
    }
    // Add remaining elements from the right half if any
    while (right <= high) {
      temp.add(arr[right]);// Add remaining right elements to the temp array
      right++;// Move to the next element in the right half
    }
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);// Copy the merged elements back to the original array
    }

  }

  public static void mergesorts(int arr[], int low, int high) {
    if (low >= high)
      return;
    int mid = (low + high) / 2; // Calculate the middle index
    mergesorts(arr, low, mid);
    mergesorts(arr, mid + 1, high);// Recursively sort the left and right halves
    merge(arr, low, mid, high);
  }

  public static void main(String[] args) {
    int array[] = array();// Calling the method to create an array and store it in a variable
    // Calling the method to print the elements of the array
    printarray(array);// This will print the elements of the array
    System.out.println(); // Print a new line for better readability

    int low = 0; // Starting index of the array
    int high = array.length - 1; // Ending index of the array
    mergesorts(array, low, high); // Call the merge sort function
    System.out.println("The sorted array is:"); // Print a message before printing the sorted array
    printarray(array); // This will print the sorted elements of the array

  }
}
