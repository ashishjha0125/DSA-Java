
import java.util.Scanner;

public class takinginputwothoutoops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Declare arrays to store data for 4 students
    String[] names = new String[4];
    String[] classes = new String[4];
    int[] rollNumbers = new int[4];
    String[] dobs = new String[4];

    // Taking input for 4 students
    for (int i = 0; i < 4; i++) {
      System.out.println("Enter details for Student " + (i + 1) + ":");

      System.out.print("Name: ");
      names[i] = sc.nextLine();

      System.out.print("Class: ");
      classes[i] = sc.nextLine();

      System.out.print("Roll Number: ");
      rollNumbers[i] = Integer.parseInt(sc.nextLine());

      System.out.print("Date of Birth (DD-MM-YYYY): ");
      dobs[i] = sc.nextLine();

      System.out.println();
    }

    // Displaying the student data
    System.out.println("===== Student Details =====");
    for (int i = 0; i < 4; i++) {
      System.out.println("Student " + (i + 1) + ":");
      System.out.println("Name      : " + names[i]);
      System.out.println("Class     : " + classes[i]);
      System.out.println("Roll No.  : " + rollNumbers[i]);
      System.out.println("DOB       : " + dobs[i]);
      System.out.println("-----------------------------");
    }

    sc.close();
  }
}
