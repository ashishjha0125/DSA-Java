import java.util.Scanner;
import java.lang.Math;

public class guessthenumber {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int number = (int) (Math.random() * 100);

    System.out.println("Welcome to Guess the Number Game!");
    System.out.println("You have to select a number between 0 and 100. Try to guess it!");

    int guess;
    do {
      System.out.print("Enter your guess: ");
      guess = s.nextInt();

      if (guess < number)
        System.out.println("Guess the bigger number");
      else if (guess > number)
        System.out.println("Guess the smaller number");

    } while (guess != number);
    System.out.println("Congratulations! You guessed the number!");
    System.out.println("The number was: " + number);

  }
}
