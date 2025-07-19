package carrantal;

public class booking {

  int bookingId;
  String bookingDate;
  String bookingTime;
  String carName;
  String userName;
  String userEmail;
  String userPhone;
  String userAddress;

  // Setter methods
  public void setBookingId(int bookingId) {
    this.bookingId = bookingId;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  public void setBookingTime(String bookingTime) {
    this.bookingTime = bookingTime;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  // Getter methods
  public String getBookingId() {
    return "Booking ID: " + bookingId;
  }

  public String getBookingDate() {
    return "Booking Date: " + bookingDate;
  }

  public String getBookingTime() {
    return "Booking Time: " + bookingTime;
  }

  public String getCarName() {
    return "Car Name: " + carName;
  }

  public String getUserName() {
    return "User Name: " + userName;
  }

  public String getUserEmail() {
    return "User Email: " + userEmail;
  }

  public String getUserPhone() {
    return "User Phone: " + userPhone;
  }

  public String getUserAddress() {
    return "User Address: " + userAddress;
  }

  // Utility method to print all booking details
  public void getBookingDetails() {
    System.out.println(getBookingId());
    System.out.println(getBookingDate());
    System.out.println(getBookingTime());
    System.out.println(getCarName());
    System.out.println(getUserName());
    System.out.println(getUserEmail());
    System.out.println(getUserPhone());
    System.out.println(getUserAddress());
  }
}
