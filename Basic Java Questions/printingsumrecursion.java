import java.util.Scanner;

public class printingsumrecursion {

  public static int printsum(int sum, int n) {

    if (n <= 0) {
      return sum;
    }
    sum = sum + n;
    return printsum(sum, n - 1);

  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;

    int submis = printsum(sum, n);
    System.out.println(submis);
  }
}