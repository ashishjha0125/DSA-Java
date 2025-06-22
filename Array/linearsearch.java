import java.util.Scanner;

public class linearsearch {

  public static int linearSearch(int array[], int size, int key) {

    for (int i = 0; i < size; i++) {
      if (array[i] == key) {
        return i; // Return the index if the key is found
      }
    }

    return -1; // Return -1 if the key is not found
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
    System.out.println("Enter the element to search: ");
    int key = sc.nextInt(); // Input the element to search for
    int result = linearSearch(array, size, key); // Perform linear search
    System.out.println("Element found at index: " + result); // Print the result
  }
}
