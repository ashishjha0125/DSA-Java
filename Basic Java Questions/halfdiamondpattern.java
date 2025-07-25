import java.util.Scanner;

public class halfdiamondpattern {

  public static void printpattern1(int n) {
    for (int i = 0; i < n; i++) {

      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void printpattern2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print("*");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of rows for the pattern: ");
    int n = s.nextInt();
    System.out.println("The pattern is: ");
    printpattern1(n);
    printpattern2(n);

  }

}
