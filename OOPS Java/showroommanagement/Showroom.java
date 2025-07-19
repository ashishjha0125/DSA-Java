package showroommanagement;

import java.util.Scanner;

public class Showroom {
  int ShowroomID;
  String ShowroomName;
  String Address;
  String ContactNumber;
  int totalCars;
  int totalEmployees;

  public void getdetails() {
    System.out.println("Showroom ID: " + ShowroomID);
    System.out.println("Showroom Name: " + ShowroomName);
    System.out.println("Address: " + Address);
    System.out.println("Contact Number: " + ContactNumber);
    System.out.println("Total Cars: " + totalCars);
    System.out.println("Total Employees: " + totalEmployees);
  }

  public void setdetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Showroom ID: ");
    ShowroomID = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Showroom Name: ");
    ShowroomName = sc.nextLine();
    System.out.print("Enter Address: ");
    Address = sc.nextLine();
    System.out.print("Enter Contact Number: ");
    ContactNumber = sc.nextLine();
    System.out.print("Enter Total Cars: ");
    totalCars = sc.nextInt();
    System.out.print("Enter Total Employees: ");
    totalEmployees = sc.nextInt();

  }

}
