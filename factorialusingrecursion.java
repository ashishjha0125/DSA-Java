import java.util.Scanner;

public class factorialusingrecursion {

  public static int printNumbers(int fact, int n) {

    if (n <= 0) {
      return fact;
    }
    fact = fact * n;
    return printNumbers(fact, n - 1);

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int fact = 1;

    int factorial = printNumbers(fact, n);
    System.out.println(factorial);
  }
}