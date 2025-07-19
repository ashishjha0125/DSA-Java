package carrantal;

public class customer {
  private String customerId;
  private String customerName;
  private String customerEmail;
  private String customerPhone;
  private String carRanted;
  private String rentalDate;
  private String returnDate;

  public String getCustomerId() {
    return "Customer ID: " + customerId;
  }

  public String getCustomerName() {
    return "Customer Name: " + customerName;
  }

  public String getCustomerEmail() {
    return "Customer Email: " + customerEmail;
  }

  public String getCustomerPhone() {
    return "Customer Phone: " + customerPhone;
  }

  public String getCarRanted() {
    return "Car Ranted: " + carRanted;
  }

  public String getRentalDate() {
    return "Rental Date: " + rentalDate;
  }

  public String getReturnDate() {
    return "Return Date: " + returnDate;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public void setCustomerPhone(String customerPhone) {
    this.customerPhone = customerPhone;
  }

  public void setCarRanted(String carRanted) {
    this.carRanted = carRanted;
  }

  public void setRentalDate(String rentalDate) {
    this.rentalDate = rentalDate;
  }

  public void setReturnDate(String returnDate) {
    this.returnDate = returnDate;
  }

  public void getCustomerDetails() {
    System.out.println(getCustomerId());
    System.out.println(getCustomerName());
    System.out.println(getCustomerEmail());
    System.out.println(getCustomerPhone());
    System.out.println(getCarRanted());
    System.out.println(getRentalDate());
    System.out.println(getReturnDate());
  }

}
