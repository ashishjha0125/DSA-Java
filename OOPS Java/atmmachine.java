import java.util.*;

class Atm {

  int balance=0;
  int PIN = 1131;

  // ✅ Constructor handles PIN check
  Atm() {
    checkpin(); // Method call inside constructor
  }

  public void checkpin() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your PIN:");
    int enterpin = sc.nextInt();
    if (enterpin == PIN) {
      menu();
    } else {
      System.out.println("Incorrect PIN. Try again.");
      checkpin(); // Recursively ask again
    }
  }

  public void menu() {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("\n----- ATM Menu -----");
      System.out.println("1. Check Balance");
      System.out.println("2. Deposit Money");
      System.out.println("3. Withdraw Money");
      System.out.println("4. Exit");
      System.out.print("Choose an option: ");

      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          checkbalance();
          break;
        case 2:
          depositmoney();
          break;
        case 3:
          withdraw();
          break;
        case 4:
          System.out.println("Thank you for using the ATM. Goodbye!");
          return;
        default:
          System.out.println("Invalid Choice. Try again.");
      }
    }
  }

  public void checkbalance() {
    System.out.println("Your current balance is: " + balance);
  }

  public void depositmoney() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter amount to deposit: ");
    int amount = sc.nextInt();
    if (amount > 0) {
      balance += amount;
      System.out.println( amount + " deposited successfully.");
    } else {
      System.out.println("Invalid amount.");
    }
  }

  public void withdraw() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter amount to withdraw: ");
    int amount = sc.nextInt();
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      System.out.println(amount + " withdrawn successfully.");
    } else {
      System.out.println("Invalid or insufficient balance.");
    }
  }
}

public class atmmachine {
  public static void main(String[] args) {
    Atm pin=new Atm(); 
  }
}
