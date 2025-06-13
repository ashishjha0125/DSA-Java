import java.util.Scanner;

public class frequencyhash {

  public static int[] array(int n) {
    int array[] = new int[n];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      array[i] = s.nextInt();

    }

    return array;
  }

  public static void printarray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " "); // Print each element of the array followed by a space
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array: ");
    // Read the number of elements in the array
    int n = s.nextInt();
    int print[] = array(n);
    printarray(print);

    int[] hash = new int[12];//
    for (int i = 0; i < print.length; i++) {
      hash[print[i]]++;// Increment the count for each element in the array
    }

    System.out.println("Enter the number of queries: ");
    int q = s.nextInt();
    while (q-- > 0) {
      System.out.println("Enter the number for which you want to check frequency: ");
      int number = s.nextInt(); // Read the number to find its occurrences
      System.out.println(hash[number]);

    } // Read the number of queries

  }
}
// This program reads an array of integers, counts the frequency of each integer
// using a hash array,
// and allows the user to query the frequency of specific integers.