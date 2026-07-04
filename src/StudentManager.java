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

        Student student = new Student(name, rollNumber, age, branch, semester, phoneNumber, email);
       

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

            System.out.print("Name: " + student.getName());
            System.out.print(", Roll no.: " + student.getRoll());
            System.out.print(", Age: " + student.getAge());
            System.out.print(", Branch: " + student.getBranch());
            System.out.print(", Semester: " + student.getSem());
            System.out.print(", Phone no.: " + student.getPhone());
            System.out.print(", Email: " + student.getEmail());
            System.out.println();
            System.out.println("-------------------------");
            System.out.println();
        }

    }

    public Student searchStudent(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRoll() == rollNumber) {
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
                    student.setName(newName);
                    System.out.println("");
                    System.out.println("Name Updated Successfully!" +
                            " Name: " + newName +
                            ", Roll no.: " + student.getRoll() +
                            ", Age: " + student.getAge() +
                            ", Branch: " + student.getBranch() +
                            ", Phone no.: " + student.getPhone() +
                            ", Semester: " + student.getSem() +
                            ", Email: " + student.getEmail());
                    break;

                case 2:
                    System.out.println("Enter Age to update: ");
                    int newAge = scanner.nextInt();
                    student.setAge(newAge);;
                    System.out.println("Age Updated Successfully!" +
                            " Name: " + student.getName() +
                            ", Roll no.: " + student.getRoll() +
                            ", Age: " + newAge +
                            ", Branch: " + student.getBranch() +
                            ", Phone no.: " + student.getPhone() +
                            ", Semester: " + student.getSem() +
                            ", Email: " + student.getEmail());
                    break;
                case 3:
                    System.out.println("Enter Branch to update: ");
                    scanner.nextLine();
                    String newBranch = scanner.nextLine();
                    student.setBranch(newBranch);;
                    System.out.println("Branch Updated Successfully!" +
                            " Name: " + student.getName() +
                            ", Roll no.: " + student.getRoll() +
                            ", Age: " + student.getAge() +
                            ", Branch: " + newBranch +
                            ", Phone no.: " + student.getPhone() +
                            ", Semester: " + student.getSem() +
                            ", Email: " + student.getEmail());
                    break;
                case 4:
                    System.out.println("Enter Semester to Update: ");
                    int newSemester = scanner.nextInt();
                    scanner.nextLine();
                    student.setSem(newSemester);;
                    System.out.println("Semester Updated Successfully!" +
                            " Name: " + student.getName() +
                            ", Roll no.: " + student.getRoll() +
                            ", Age: " + student.getAge() +
                            ", Branch: " + student.getBranch() +
                            ", Phone no.: " + student.getPhone() +
                            ", Semester: " + newSemester +
                            ", Email: " + student.getEmail());
                    break;
                case 5:
                    System.out.println("Enter PhoneNo. to Update: ");
                    scanner.nextLine();
                    String newPhone = scanner.nextLine();
                    student.setPhone(newPhone);
                    System.out.println("Phone no. Updated Successfully!" +
                            " Name: " + student.getName() +
                            ", Roll no.: " + student.getRoll() +
                            ", Age: " + student.getAge() +
                            ", Branch: " + student.getBranch() +
                            ", Phone no.: " + newPhone +
                            ", Semester: " + student.getSem() +
                            ", Email: " + student.getEmail());
                    break;
                case 6:
                    System.out.println("Enter Email. to Update: ");
                    scanner.nextLine();
                    String newEmail = scanner.nextLine();
                    student.setEmail(newEmail);;
                    System.out.println("Email Updated Successfully!" +
                            " Name: " + student.getName() +
                            ", Roll no.: " + student.getRoll() +
                            ", Age: " + student.getAge() +
                            ", Branch: " + student.getBranch() +
                            ", Phone no.: " + student.getPhone() +
                            ", Semester: " + student.getSem() +
                            ", Email: " + newEmail);
                    break;

                default:
                    System.out.println("Invalid update option.");
            }

        }
    }

    public void deleteStudent(int rollNumber) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getRoll() == rollNumber) {
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
