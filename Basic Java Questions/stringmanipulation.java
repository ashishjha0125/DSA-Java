
import java.util.Scanner;

public class stringmanipulation {
  public static void main(String[] args) {

    String str1 = "Ashish";
    String str2 = " is ";
    String str3 = "A Programmer.";

    // Concatenating strings
    String str4 = str1 + str2 + str3;
    System.out.println(str4);

    // charAt method
    System.out.println(str4.charAt(8));
    System.out.println(str4.charAt(14));
    System.out.println(str4.charAt(22));

    // length method
    System.out.println(str4.length());

    // replace method
    String str5 = str4.replace("i", "J");
    System.out.println(str5);

    // substring method
    String str6 = str4.substring(0, 9);
    System.out.println(str6);

    String str7 = " Devloper.";

    System.out.println(str6 + str7);

  }
}
