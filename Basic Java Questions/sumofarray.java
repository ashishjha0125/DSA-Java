import java.util.Scanner;

public class sumofarray {

  public static int[] array() { // This function is used to create tha array

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the Size of Array:- ");
    int n = s.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();

    }
    return arr;
  }

  public static int sumofarr(int arr[]) {

    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int arr[] = array();
    int sum = sumofarr(arr);
    System.out.println("The summation of the input in array is " + sum);
  }
}
