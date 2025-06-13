import java.util.Scanner;

public class fibonacci {

  public static boolean fibon(int n) {

    int a = 0;
    int b = 1;
    for (int i = 1; i <= n; i++) {
      // System.out.println(a);
      int c = a + b;
      a = b;
      b = c;
      if (a == n) {
        return true;
      }

    }
    return false;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    fibon(n);
  }

}// Import the Scanner class