import java.util.Scanner;

public class creatingArray {

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

  public static void main(String[] args) {

    int array[] = array();// Calling the method to create an array and store it in a variable
    // Calling the method to print the elements of the array
    printarray(array);// This will print the elements of the array
    System.out.println(); // Print a new line for better readability

  }

}
