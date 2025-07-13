import java.util.*;

class Atm {

  int balance;
  int PIN=1131;

  public void checkpin() {
    System.out.println("Enter Your PIN");
    Scanner sc = new Scanner(System.in);
    int enterpin = sc.nextInt();
    if (enterpin == PIN) {
      menu();
    } else {
      System.out.println("Enter Correct PIN");
      checkpin();
    }
  }

  public void menu() {
    System.out.println();
    System.out.println();
   
  System.out.println("\n----- ATM Menu -----");
  System.out.println("Please select an option:");
  System.out.println("1. Check Balance");
  System.out.println("2. Deposit Money");
  System.out.println("3. Withdraw Money");
  System.out.println("4. Exit");
   Scanner sc = new Scanner(System.in);
  int choice = sc.nextInt();
  if(choice==1){
    checkbalance();
  }else if(choice==2){
    depositmoney();
    checkbalance();
  }else if(choice==3){
    withdraw();
    checkbalance();
  }else if(choice==4){
    System.out.println("Thank you for using the ATM. Goodbye!");
     return;
  }else{
    System.out.println("Invalid Choice, Please try again");
  }
  
}

public void checkbalance() {
  System.out.println("Your Current Balance is: " + balance);
  menu();
}
public void depositmoney(){
  System.out.println("Enter Amount to Deposit");
   Scanner sc = new Scanner(System.in);
  int depositmoney = sc.nextInt();
  if(depositmoney > 0){
    balance += depositmoney;
    System.out.println("Amount Deposited Successfully");
}
}
public void withdraw(){
  System.out.println("Enter Amount to withdraw");
  Scanner sc = new Scanner(System.in);
  int withdrawmoney = sc.nextInt();
  if(withdrawmoney > 0 && withdrawmoney <= balance){
    balance -= withdrawmoney;
    System.out.println("Amount Withdrawn Successfully");
}
}

}


public class atmmachine {
  public static void main(String[] args) {
    Atm atm = new Atm();
    atm.checkpin();
  }
}
