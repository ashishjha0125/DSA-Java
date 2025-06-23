import java.util.*;

public class arrayunion {

  public static int[] brutunion(int[] array1, int[] array2) {

    Set<Integer> set = new TreeSet<>();

    for (int num : array1) {
      set.add(num);
    }
    for (int num : array2) {
      set.add(num);
    }

    return set.stream().mapToInt(i -> i).toArray();

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the First  array: ");
    int size = sc.nextInt(); // Input the size of the array
    int array[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      array[i] = sc.nextInt(); // Input each element of the array
    }
    System.out.println("Enter the size of the Second  array: ");
    int size1 = sc.nextInt(); // Input the size of the array
    int array1[] = new int[size1];

    for (int i = 0; i < size1; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      array1[i] = sc.nextInt(); // Input each element of the array
    }
    System.out.println("Your first array is : ");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Your Second array is : ");
    for (int num : array1) {
      System.out.print(num + " ");
    }

    System.out.println("Union of the Array is");
    int[] union = brutunion(array, array1);
    for (int num : union) {
      System.out.print(num + " ");
    }

  }

}
