package carrantal;

import java.util.Scanner;

public class car {
  private String carName;
  private String carModel;
  private int carYear;
  private double rentalPrice;
  private String carColor;
  private String carType;
  private String carMileage;
  private String carInsuranceDetails;
  private String carRegistrationDetails;
  private String carFuelType;
  private String carFeatures;
  private String carPrice;
  private String carDescription;
  boolean isAvailable = true;

  public void rent() {
    isAvailable = false;
    System.out.println("Car has been rented successfully.");
  }

  public void returnCar() {
    isAvailable = true;
    System.out.println("Car has been returned successfully.");
  }

  public void setrentalPrice(double rentalPrice) {
    this.rentalPrice = rentalPrice;
  }

  public void setcarname(String carName) {
    this.carName = carName;
  }

  public void setcarModel(String carModel) {
    this.carModel = carModel;
  }

  public void setcarYear(int carYear) {
    this.carYear = carYear;
  }

  public void setcarColor(String carColor) {
    this.carColor = carColor;
  }

  public void setcarType(String carType) {
    this.carType = carType;
  }

  public void setcarMileage(String carMileage) {
    this.carMileage = carMileage;
  }

  public void setcarInsuranceDetails(String carInsuranceDetails) {
    this.carInsuranceDetails = carInsuranceDetails;
  }

  public void setcarRegistrationDetails(String carRegistrationDetails) {
    this.carRegistrationDetails = carRegistrationDetails;
  }

  public void setcarFuelType(String carFuelType) {
    this.carFuelType = carFuelType;
  }

  public void setcarFeatures(String carFeatures) {
    this.carFeatures = carFeatures;
  }

  public void setcarPrice(String carPrice) {
    this.carPrice = carPrice;
  }

  public void setcarDescription(String carDescription) {
    this.carDescription = carDescription;
  }

  public void setcarAvailability(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public String getcarName() {
    return carName;
  }

  public String getcarModel() {
    return carModel;
  }

  public int getcarYear() {
    return carYear;
  }

  public String getcarColor() {
    return carColor;
  }

  public String getcarType() {
    return carType;
  }

  public String getcarMileage() {
    return carMileage;
  }

  public String getcarInsuranceDetails() {
    return carInsuranceDetails;
  }

  public String getcarRegistrationDetails() {
    return carRegistrationDetails;
  }

  public String getcarFuelType() {
    return carFuelType;
  }

  public String getcarFeatures() {
    return carFeatures;
  }

  public String getcarPrice() {
    return carPrice;
  }

  public String getcarDescription() {
    return carDescription;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setcarname() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Name: ");
    carName = sc.nextLine();
  }

  public void setcarModel() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Model: ");
    carModel = sc.nextLine();
  }

  public void setcarYear() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Year: ");
    carYear = sc.nextInt();
    sc.nextLine(); // Consume newline
  }

  public void setcarColor() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Color: ");
    carColor = sc.nextLine();
  }

  public void setcarType() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Type: ");
    carType = sc.nextLine();
  }

  public void setcarMileage() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Mileage: ");
    carMileage = sc.nextLine();
  }

  public void setcarInsuranceDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Insurance Details: ");
    carInsuranceDetails = sc.nextLine();
  }

  public void setcarRegistrationDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Registration Details: ");
    carRegistrationDetails = sc.nextLine();
  }

  public void setcarFuelType() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Fuel Type: ");
    carFuelType = sc.nextLine();
  }

  public void setcarFeatures() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Features: ");
    carFeatures = sc.nextLine();
  }

  public void setcarPrice() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Price: ");
    carPrice = sc.nextLine();
  }

  public void setcarDescription() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Car Description: ");
    carDescription = sc.nextLine();
  }

  public void setcarAvailability() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Is the car available? (true/false): ");
    isAvailable = sc.nextBoolean();
  }

  public void getCarDetails() {
    System.out.println("Car Name: " + carName);
    System.out.println("Car Model: " + carModel);
    System.out.println("Car Year: " + carYear);
    System.out.println("Car Color: " + carColor);
    System.out.println("Car Type: " + carType);
    System.out.println("Car Mileage: " + carMileage);
    System.out.println("Car Insurance Details: " + carInsuranceDetails);
    System.out.println("Car Registration Details: " + carRegistrationDetails);
    System.out.println("Car Fuel Type: " + carFuelType);
    System.out.println("Car Features: " + carFeatures);
    System.out.println("Car Price: " + carPrice);
    System.out.println("Car Description: " + carDescription);
    System.out.println("Is Available: " + isAvailable);
  }

}
