import java.util.Scanner;

public class secondsmallest {

  public static int secondSmallest(int array[], int n) {

    if (n < 2) {
      return -1; // If there are less than 2 elements, return -1
    }
    int smallest = Integer.MAX_VALUE;
    int secondsmallest = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      if (array[i] < smallest) {
        secondsmallest = smallest; // Update second smallest
        smallest = array[i]; // Update smallest
      } else if (array[i] < secondsmallest && array[i] != smallest) {
        secondsmallest = array[i]; // Update second smallest if current element is not equal to smallest
      }
    }

    return secondsmallest;
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
    int smallest = secondSmallest(array, size);
    System.out.println("The second smallest element in the array is: " + smallest);
  }

}
