import java.util.Scanner;

public class swapthenumber {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter two numbers to swap");
    long a = s.nextLong();
    long b = s.nextLong();
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("Your first number is " + a + " and second number is " + b);
  }

}
