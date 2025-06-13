import java.util.Scanner;

public class diamondpattern {

  public static void printpattern1(int n) {

    for (int i = 0; i < n; i++) {
      // For printing the spaces before stars in each row
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      // For printing the stars in each row
      for (int j = 0; j < 2 * i + 1; j++) {

        System.out.print("*");
      }

      // For printing the spaces after the stars in each row
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      // As soon as the stars for each iteration are printed, we move to the
      // next row and give a line break otherwise all stars
      // would get printed in 1 line.
      System.out.println();
    }
  }

  // print for inverted isosceles triangle pattern
  public static void printpattern(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * (n - i) + 1; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= i; j++) {
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
    printpattern(n);

  }

}
