import java.util.Scanner;

public class nooftimeoccur {

  // This class is designed
  // This class contains methods to read an array of integers, print the array,
  // and count occurrences of a specific number in the array
  // This method reads n integers from the user and returns them as an array
  public static int[] array(int n) {
    int array[] = new int[n];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      array[i] = s.nextInt();

    }

    return array;
  }

  // This method reads n integers from the user and returns them as an array
  public static void printarray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " "); // Print each element of the array followed by a space
    }
  }

  // This method prints the elements of the array in a single line
  public static int noofTimes(int[] array, int number) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        count++;
      }
    }
    return count; // Return the count of occurrences of n in the array
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); // Read the number of elements in the array
    int print[] = array(n);
    printarray(print); // Call the method to read the array elements
    System.out.println("\nEnter the number to find its occurrences: ");
    int number = s.nextInt(); // Read the number to find its occurrences
    int count = noofTimes(print, number);
    System.out.println("The number " + number + " occurs " + count + " times in the array."); // Print the count of
                                                                                              // occurrences
  }

}
