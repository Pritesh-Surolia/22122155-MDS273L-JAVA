import java.util.Scanner;

class Student {
    String regNo;
    String name;
    String email;
    String phone;
    String class_;
    String department;

    public Student(String regNo, String name, String email, String phone, String class_, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.class_ = class_;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Reg. No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + class_);
        System.out.println("Department: " + department);
    }

    public String getRegNo() {
        return regNo;
    }

    public String getName() {
        return name;
    }
}

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;

        while (true) {
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the reg. no.: ");
                    String regNo = scanner.nextLine();
                    System.out.print("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter the phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter the class: ");
                    String class_ = scanner.nextLine();
                    System.out.print("Enter the department: ");
                    String department = scanner.nextLine();
                    students[count] = new Student(regNo, name, email, phone, class_, department);
                    count++;
                    break;
                case 2:
                    System.out.print("Enter the name or reg. no. of the student: ");
                    String searchQuery = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].getName().equals(searchQuery) || students[i].getRegNo().equals(searchQuery)) {
                            students[i].printDetails();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found.");
                    }
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        students[i].printDetails();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println();
        }
    }
}
