package carrantal;

import java.util.Scanner;

interface adminInterface {

  public void getBookingDetails();

  public void getCarDetails();

}

public class main {

  public static void displayMenu() {
    System.out.println("Welcome to Carrantal!");
    System.out.println("1. Book a Car");
    System.out.println("2. Admin Login");
    System.out.println("3. User Registration");
    System.out.println("4. Exit");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    admin admin = new admin();
    System.out.println("Enter Admin Details:");
    System.out.print("Admin ID: ");
    admin.setadminId(sc.nextLine());

    System.out.print("Admin Name: ");
    admin.setadminName(sc.nextLine());

    System.out.print("Admin Email: ");
    admin.setadminEmail(sc.nextLine());

    System.out.print("Admin Password: ");
    admin.setadminPassword(sc.nextLine());

    System.out.print("Admin Phone: ");
    admin.setadminPhone(sc.nextLine());

    System.out.print("Admin Address: ");
    admin.setadminAddress(sc.nextLine());

  }

}
