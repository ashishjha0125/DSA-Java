package carrantal;

import java.util.Scanner;

public class admin extends car implements adminInterface {
  String adminId;
  String adminName;
  String adminEmail;
  String adminPassword;
  String adminPhone;
  String adminAddress;

  Scanner sc = new Scanner(System.in);

  public void setadminId(String adminId) {
    this.adminId = adminId;
  }

  public void setadminName(String adminName) {
    this.adminName = adminName;
  }

  public void setadminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  public void setadminPassword(String adminPassword) {
    this.adminPassword = adminPassword;
  }

  public void setadminPhone(String adminPhone) {
    this.adminPhone = adminPhone;
  }

  public void setadminAddress(String adminAddress) {
    this.adminAddress = adminAddress;
  }

  public String getadminId() {
    return "Admin ID: " + adminId;
  }

  public String getadminName() {
    return "Admin Name: " + adminName;
  }

  public String getadminEmail() {
    return "Admin Email: " + adminEmail;
  }

  public String getadminPassword() {
    return "Admin Password: " + adminPassword;
  }

  public String getadminPhone() {
    return "Admin Phone: " + adminPhone;
  }

  public String getadminAddress() {
    return "Admin Address: " + adminAddress;
  }

  public void getdetails() {
    getadminId();
    getadminName();
    getadminEmail();
    getadminPhone();
    getadminAddress();
  }

  public void adminPannel() {
    System.out.println("Welcome to Admin Panel!");
    // Additional admin functionalities can be added here
    System.out.println("1. View Car Details");
    System.out.println("2. Manage Bookings");
    System.out.println("3. Manage Customers");

    int choice = 0;
    choice = sc.nextInt();
    switch (choice) {
      case 1 -> {
        System.out.println("Viewing Car Details...");
        getCarDetails();
      }
      case 2 -> {
        System.out.println("Managing Bookings...");
        getBookingDetails();

      }
      case 3 -> System.out.println("Managing Customers...");
      // Logic to manage customers
      default -> System.out.println("Invalid choice. Please try again.");
    }
  }

}
