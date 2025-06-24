
import java.util.Arrays;
import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class intersectionoptimal {

  public static Set<Integer> intersection(int[] array1, int[] array2) {
    int n = array1.length;
    int m = array2.length;
    int i = 0, j = 0;
    Set<Integer> result = new HashSet<>();

    while (i < n && j < m) {
      if (array1[i] < array2[j]) {
        i++;
      } else if (array2[j] < array1[i]) {
        j++;
      } else {

        result.add(array1[i]);

        i++;
        j++;
      }

    }
    return result;
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
    Arrays.sort(array);
    Arrays.sort(array1);
    System.out.println("Your first array after sorting is : ");
    for (int num : array) {
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Your Second array after sorting is : ");
    for (int num : array1) {
      System.out.print(num + " ");
    }

    Set<Integer> intersection = intersection(array, array1);
    System.out.println();
    System.out.println("Intersection of the arrays is:");
    for (int num : intersection) {
      System.out.print(num + " ");
    }
  }
}
