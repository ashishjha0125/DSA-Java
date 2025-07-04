import java.util.Scanner;

public class classobject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating first student object and taking name dynamically
        Student student1 = new Student();
        System.out.print("Enter name for student 1: ");
        student1.name = sc.nextLine();
        student1.age = 21;
        student1.rollNo = 1;
        student1.address = "Silver City, near Balaji Mandir, Pavi Sadakpur, Loni, Ghaziabad, Uttar Pradesh - 201102";
        student1.phoneNo = 8287372958L;
        student1.email = "ashishjha97181@gmail.com";
        student1.course = "B.Tech";
        student1.department = "Computer Science";
        student1.universityName = "Amity University";

        // Calling full details method
        student1.printDetails();

        // Creating second student object
        Student student2 = new Student();
        student2.name = "Neha";
        student2.age = 21;
        student2.rollNo = 2;
        student2.address = "Pavi Sadakpur, Loni, Ghaziabad, Uttar Pradesh - 201102";
        student2.phoneNo = 8383996359L;
        student2.email = "neha@gmail.com";
        student2.course = "Aviation";
        student2.department = "Not Specified";
        student2.universityName = "Franfine Institute";

        // Calling overloaded method with name and email only
        student2.printDetails(student2.name, student2.email);

        // Close scanner resource
        sc.close();
    }
}

class Student {

    // Fields (attributes)
    String name;
    Integer age;
    Integer rollNo;
    String address;
    long phoneNo;
    String email;
    String course;
    String department;
    String universityName;

    // Method 1: Print full details
    void printDetails() {
        System.out.println("\n----- Student Full Details -----");
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

    // Method 2: Overloaded - Print only basic details
    void printDetails(String name, String email) {
        System.out.println("\n----- Student Basic Details -----");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
