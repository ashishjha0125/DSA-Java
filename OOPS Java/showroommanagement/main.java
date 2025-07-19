package showroommanagement;

import java.util.Scanner;

interface utility {
  public void getdetails();

  public void setdetails();
}

public class main {
  public static void menu() {
    System.out.println("Welcome to the Showroom Management System");
    System.out.println("1. Add Showroom");
    System.out.println("2. Add Car");
    System.out.println("3. Add Employee");
    System.out.println("4. View Showroom Details");
    System.out.println("5. View Car Details");
    System.out.println("6. View Employee Details");
    System.out.println("7. Exit");
  }
@
  public static void main(String[] args) {

    Showroom showroom[] = new Showroom[5];
    employee employee[] = new employee[5];
    cars car[] = new cars[5];

    int car_counter = 0;
    int showroom_counter = 0;
    int employees_counter = 0;

    int choice = 100;
    Scanner sc = new Scanner(System.in);

    while (choice != 7) {
      menu();
      System.out.print("Enter your choice: ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume newline

      switch (choice) {

        case 1: {
          if (showroom_counter < showroom.length) {
            showroom[showroom_counter] = new Showroom();
            showroom[showroom_counter].setdetails();
            showroom_counter++;
          } else {
            System.out.println("Showroom limit reached.");
          }
          break;
        }
        case 2: {
          if (car_counter < car.length) {
            car[car_counter] = new cars();
            car[car_counter].setdetails();
            car_counter++;
          } else {
            System.out.println("Car limit reached.");
          }
          break;
        }
        case 3: {
          if (employees_counter < employee.length) {
            employee[employees_counter] = new employee();
            employee[employees_counter].setdetails();
            employees_counter++;
          } else {
            System.out.println("Employee limit reached.");
          }
          break;
        }
        case 4: {
          for (int i = 0; i < showroom_counter; i++) {
            System.out.println("Showroom " + (i + 1) + ":");
            showroom[i].getdetails();
          }
          break;
        }
        case 5: {
          for (int i = 0; i < car_counter; i++) {
            System.out.println("Car " + (i + 1) + ":");
            car[i].getdetails();
          }
          break;
        }
        case 6: {
          for (int i = 0; i < employees_counter; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            employee[i].getdetails();
          }
          break;
        }
        case 7: {
          System.out.println("Exiting the Showroom Management System. Goodbye!");

          return;
        }
        default: {
          System.out.println("Invalid choice. Please try again.");
          break;
        }

      }

    }
    sc.close();
  }

}
