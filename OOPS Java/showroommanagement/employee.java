package showroommanagement;

import java.util.Scanner;

public class employee extends Showroom implements utility {
  int employeeID;
  String employeeName;
  String employeePosition;
  String employeeContact;
  double employeeSalary;
  int employeeExperience;
  String employeeAddress;
  String employeeEmail;
  String employeeJoiningDate;

  @Override
  public void getdetails() {
    System.out.println("Employee ID: " + employeeID);
    System.out.println("Employee Name: " + employeeName);
    System.out.println("Position: " + employeePosition);
    System.out.println("Contact: " + employeeContact);
    System.out.println("Salary: " + employeeSalary);
    System.out.println("Experience: " + employeeExperience + " years");
    System.out.println("Address: " + employeeAddress);
    System.out.println("Email: " + employeeEmail);
    System.out.println("Joining Date: " + employeeJoiningDate);

  }

  @Override
  public void setdetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Employee ID: ");
    employeeID = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Employee Name: ");
    employeeName = sc.nextLine();
    System.out.print("Enter Position: ");
    employeePosition = sc.nextLine();
    System.out.print("Enter Contact: ");
    employeeContact = sc.nextLine();
    System.out.print("Enter Salary: ");
    employeeSalary = sc.nextDouble();
    System.out.print("Enter Experience (in years): ");
    employeeExperience = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Address: ");
    employeeAddress = sc.nextLine();
    System.out.print("Enter Email: ");
    employeeEmail = sc.nextLine();
    System.out.print("Enter Joining Date: ");
    employeeJoiningDate = sc.nextLine();

  }
}