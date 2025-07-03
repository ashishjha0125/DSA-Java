import java.util.Scanner;

public class classobject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        System.out.print("Enter name for student 1: ");
        student1.name = sc.nextLine(); // Read name from user input
        student1.age = 21;
        student1.rollNo = 1;
        student1.address = "Silver City, near Balaji Mandir, Pavi Sadakpur, Loni, Ghaziabad, Uttar Pradesh - 201102";
        student1.phoneNo = 8287372958L; // use 'L' for long literals
        student1.email = "ashishjha97181@gmail.com";
        student1.course = "B.Tech";
        student1.department = "Computer Science";
        student1.universityName = "Amity University";

        student1.printDetails();

        Student student2 = new Student();

        student2.name = "Neha";
        student2.age = 21;
        student2.rollNo = 2;
        student2.address = "Pavi Sadakpur, Loni, Ghaziabad, Uttar Pradesh - 201102";
        student2.phoneNo = 8383996359L; // use 'L' for long literals
        student2.email = "neha@gmail.com";
        student2.course = "Aviation";
        student2.department = "not specified";
        student2.universityName = "franfine Institute";

        student2.printDetails();
        sc.close(); // Close the scanner to prevent resource leaks
    }
}

class Student {

    String name;
    Integer age;
    Integer rollNo;
    String address;
    long phoneNo;
    String email;
    String course;
    String department;
    String universityName;

    void printDetails() {
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Address: " + address);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Department: " + department);
        System.out.println("University: " + universityName);
    }
}
