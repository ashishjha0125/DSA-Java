package showroommanagement;

import java.util.Scanner;

public class cars extends Showroom implements utility {
  int carID;
  String carName;
  String carModel;
  String carBrand;
  double carPrice;
  String carColor;
  int carYear;
  String carType;
  String carFuelType;
  String carTransmission;
  String carDescription;

  @Override
  public void getdetails() {
    System.out.println("Car ID: " + carID);
    System.out.println("Car Name: " + carName);
    System.out.println("Model: " + carModel);
    System.out.println("Brand: " + carBrand);
    System.out.println("Price: " + carPrice);
    System.out.println("Color: " + carColor);
    System.out.println("Year: " + carYear);
    System.out.println("Type: " + carType);
    System.out.println("Fuel Type: " + carFuelType);
    System.out.println("Transmission: " + carTransmission);
    System.out.println("Description: " + carDescription);
  }

  @Override
  public void setdetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car ID: ");
    carID = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Car Name: ");
    carName = sc.nextLine();
    System.out.print("Enter Model: ");
    carModel = sc.nextLine();
    System.out.print("Enter Brand: ");
    carBrand = sc.nextLine();
    System.out.print("Enter Price: ");
    carPrice = sc.nextDouble();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Color: ");
    carColor = sc.nextLine();
    System.out.print("Enter Year: ");
    carYear = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Type: ");
    carType = sc.nextLine();
    System.out.print("Enter Fuel Type: ");
    carFuelType = sc.nextLine();
    System.out.print("Enter Transmission: ");
    carTransmission = sc.nextLine();
    System.out.print("Enter Description: ");
    carDescription = sc.nextLine();

  }

}
