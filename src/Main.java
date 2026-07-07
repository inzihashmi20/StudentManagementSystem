import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("===============-STUDENT MANAGEMENT SYSTEM-===============");
            System.out.println();
            System.out.println("1. Add Student ");
            System.out.println("2. Display Students ");
            System.out.println("3. Search Student ");
            System.out.println("4. Update Student ");
            System.out.println("5. Delete Student ");
            System.out.println("6. Exit ");
            System.out.println();
            System.out.println("=========================================================");
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
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Student RollNumber: ");
                    int rollNum = scanner.nextInt();
                    Student student2 = studentManager.searchStudent(rollNum);
                    if (student2 != null) {
                        System.out.println(student2);
                        studentManager.updateStudent(rollNum);
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;
                case 5:
                    System.out.println("Enter Student RollNumber: ");
                    int rollNumb = scanner.nextInt();
                    studentManager.deleteStudent(rollNumb);
                    break;

                case 6:
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
