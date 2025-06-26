import java.util.Scanner;

public class movezerotoend {

  public static void rotatebrute(int[] array, int n) { // time complexity O(n) and space complexity is O(n) due to extra

    int[] temp = new int[n]; // temp array All intilized to zero

    int j = 0;
    for (int i = 0; i < n; i++) {
      if (array[i] != 0) {
        temp[j] = array[i];
        j++;
      }
    }

    for (int i = 0; i < n; i++) {
      array[i] = temp[i];

    }

    System.out.println("After moving zero to the end");
    for (int num : array) {
      System.out.println(num);
    }

  }

  public static int[] optimal(int[] array, int n) { // time complexity O(n) and space complexity is O(1)
    int j = -1;
    for (int i = 0; i < n; i++) {
      if (array[i] == 0) {
        j = i;
        break;
      }

    }

    if (j == -1)
      return array;

    for (int i = j + 1; i < n; i++) {
      if (array[i] != 0) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        j++;
      }

    }
    return array;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int n = s.nextInt();

    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = s.nextInt();
    }

    rotatebrute(array, n);

    System.out.println("Enter the size of the array");
    int n1 = s.nextInt();

    int[] array1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      array1[i] = s.nextInt();
    }

    int[] array2 = optimal(array1, n1);
    System.out.println("After moving zero to the end");
    for (int num : array2) {
      System.out.println(num);
    }
    s.close();
  }

}
