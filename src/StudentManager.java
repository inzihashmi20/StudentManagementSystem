import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);

    Student[] students = new Student[100];
    int studentCount = 0;

    public void addStudent() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Roll No.: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Branch: ");
        String branch = scanner.nextLine();
        System.out.println("Enter Semester: ");
        int semester = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Phone no.: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        Student student = new Student();
        student.name = name;
        student.rollNumber = rollNumber;
        student.age = age;
        student.branch = branch;
        student.semester = semester;
        student.phoneNumber = phoneNumber;
        student.email = email;

        students[studentCount] = student;
        studentCount++;
        System.out.println("Student added successlly!");
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students found.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];

            System.out.print("Name: " + student.name);
            System.out.print(", Roll no.: " + student.rollNumber);
            System.out.print(", Age: " + student.age);
            System.out.print(", Branch: " + student.branch);
            System.out.print(", Semester: " + student.semester);
            System.out.print(", Phone no.: " + student.phoneNumber);
            System.out.print(", Email: " + student.email);
            System.out.println("-------------------------");
            System.out.println();
        }

    }

    public Student searchStudent(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber == rollNumber) {
                return students[i];
            }
        }
        return null;
    }

    public void updateStudent(int rollNumber) {
        Student student = searchStudent(rollNumber);
        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println("What would you like to update? (1-6): ");
            System.out.println("1. Name: ");
            System.out.println("2. Age: ");
            System.out.println("3. Branch: ");
            System.out.println("4. Semester: ");
            System.out.println("5. Phone Number: ");
            System.out.println("6. Email: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name to update: ");
                    scanner.nextLine();
                    String newName = scanner.nextLine();
                    student.name = newName;
                    System.out.println("");
                    System.out.println("Name Updated Successfully!" +
                            " Name: " + newName +
                            ", Roll no.: " + student.rollNumber +
                            ", Age: " + student.age +
                            ", Branch: " + student.branch +
                            ", Phone no.: " + student.phoneNumber +
                            ", Semester: " + student.semester +
                            ", Email: " + student.email);
                    break;

                case 2:
                    System.out.println("Enter Age to update: ");
                    int newAge = scanner.nextInt();
                    student.age = newAge;
                    System.out.println("Age Updated Successfully!" +
                            " Name: " + student.name +
                            ", Roll no.: " + student.rollNumber +
                            ", Age: " + newAge +
                            ", Branch: " + student.branch +
                            ", Phone no.: " + student.phoneNumber +
                            ", Semester: " + student.semester +
                            ", Email: " + student.email);
                    break;
                case 3:
                    System.out.println("Enter Branch to update: ");
                    scanner.nextLine();
                    String newBranch = scanner.nextLine();
                    student.branch = newBranch;
                    System.out.println("Branch Updated Successfully!" +
                            " Name: " + student.name +
                            ", Roll no.: " + student.rollNumber +
                            ", Age: " + student.age +
                            ", Branch: " + newBranch +
                            ", Phone no.: " + student.phoneNumber +
                            ", Semester: " + student.semester +
                            ", Email: " + student.email);
                    break;
                case 4:
                    System.out.println("Enter Semester to Update: ");
                    int newSemester = scanner.nextInt();
                    scanner.nextLine();
                    student.semester = newSemester;
                    System.out.println("Semester Updated Successfully!" +
                            " Name: " + student.name +
                            ", Roll no.: " + student.rollNumber +
                            ", Age: " + student.age +
                            ", Branch: " + student.branch +
                            ", Phone no.: " + student.phoneNumber +
                            ", Semester: " + newSemester +
                            ", Email: " + student.email);
                    break;
                case 5:
                    System.out.println("Enter PhoneNo. to Update: ");
                    scanner.nextLine();
                    String newPhone = scanner.nextLine();
                    student.phoneNumber = newPhone;
                    System.out.println("Phone no. Updated Successfully!" +
                            " Name: " + student.name +
                            ", Roll no.: " + student.rollNumber +
                            ", Age: " + student.age +
                            ", Branch: " + student.branch +
                            ", Phone no.: " + newPhone +
                            ", Semester: " + student.semester +
                            ", Email: " + student.email);
                    break;
                case 6:
                    System.out.println("Enter Email. to Update: ");
                    scanner.nextLine();
                    String newEmail = scanner.nextLine();
                    student.email = newEmail;
                    System.out.println("Email Updated Successfully!" +
                            " Name: " + student.name +
                            ", Roll no.: " + student.rollNumber +
                            ", Age: " + student.age +
                            ", Branch: " + student.branch +
                            ", Phone no.: " + student.phoneNumber +
                            ", Semester: " + student.semester +
                            ", Email: " + newEmail);
                    break;

                default:
                    System.out.println("Invalid update option.");
            }

        }
    }

    public void deleteStudent(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber == rollNumber) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                students[studentCount] = null;
                System.out.println("Student deleted successfully!");
                return;

            }
        }
        System.out.println("Student not found.");
    }
}
