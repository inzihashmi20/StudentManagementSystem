import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("==============-STUDENT MANAGEMENT SYSTEM-=============");
            System.out.println();
            System.out.println("1. Add Student ");
            System.out.println("2. Display Students ");
            System.out.println("3. Search Student ");
            System.out.println("4. Update Student ");
            System.out.println("5. Exit ");
            System.out.print("Enter Your Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.displayStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll Number: ");
                    int rollNumber = scanner.nextInt();
                    Student student = studentManager.searchStudent(rollNumber);
                    if (student != null) {
                        System.out.println("Name: " + student.name +
                                ", Roll no.: " + student.rollNumber +
                                ", Age: " + student.age +
                                ", Branch: " + student.branch +
                                ", Phone no.: " + student.phoneNumber +
                                ", Semester: " + student.semester +
                                ", Email: " + student.email);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Student RollNumber: ");
                    int rollNum = scanner.nextInt();
                    Student student2 = studentManager.searchStudent(rollNum);
                    if (student2 != null) {
                        System.out.println("Name: " + student2.name +
                                ", Roll no.: " + student2.rollNumber +
                                ", Age: " + student2.age +
                                ", Branch: " + student2.branch +
                                ", Phone no.: " + student2.phoneNumber +
                                ", Semester: " + student2.semester +
                                ", Email: " + student2.email);
                                studentManager.updateStudent(rollNum);
                    }
                    else{
                        System.out.println("Student not found.");
                    }

                    break;
                case 5:
                    System.out.println("Thank you! Have a great day :) ");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        }
        scanner.close();
    }
}
.