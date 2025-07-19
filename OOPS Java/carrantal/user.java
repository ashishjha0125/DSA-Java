package carrantal;

public class user {
  private String userName;
  private String userEmail;
  private String userPhone;
  private String userAddress;
  private String userPassword;

  // Setter methods
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

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  // Getter methods
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

  public String getUserPassword() {
    return "User Password: " + userPassword;
  }

  // Utility method to display all user details
  public void getUserDetails() {
    System.out.println(getUserName());
    System.out.println(getUserEmail());
    System.out.println(getUserPhone());
    System.out.println(getUserAddress());
    System.out.println(getUserPassword());
  }
}
