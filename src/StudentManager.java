import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent() {

        // System.out.println("Enter Roll No.: ");
        int rollNumber = getValidRollNumber();
        scanner.nextLine();
        // if (searchStudent(rollNumber) != null) {
        // System.out.println("Roll number already exists! ");
        // return;
        // }

        // System.out.println("Enter Name: ");
        String name = getValidName();
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

        students.add(student);
        System.out.println("Student added successlly!");
    }

    public void displayStudents() {
        if (students.size() == 0) {
            System.out.println("No students found.");
            return;
        }
        for (Student student : students) {
            System.out.println(student);
            System.out.println("-------------------------");
            System.out.println();
        }

    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRoll() == rollNumber) {
                return student;
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
                    System.out.println("Name Updated Successfully!");
                    System.out.println(student);
                    break;

                case 2:
                    System.out.println("Enter Age to update: ");
                    int newAge = scanner.nextInt();
                    student.setAge(newAge);
                    ;
                    System.out.println("Age Updated Successfully!");
                    System.out.println(student);
                    break;
                case 3:
                    System.out.println("Enter Branch to update: ");
                    scanner.nextLine();
                    String newBranch = scanner.nextLine();
                    student.setBranch(newBranch);
                    ;
                    System.out.println("Branch Updated Successfully!");
                    System.out.println(student);
                    break;
                case 4:
                    System.out.println("Enter Semester to Update: ");
                    int newSemester = scanner.nextInt();
                    scanner.nextLine();
                    student.setSem(newSemester);
                    ;
                    System.out.println("Semester Updated Successfully!");
                    System.out.println(student);
                    break;
                case 5:
                    System.out.println("Enter PhoneNo. to Update: ");
                    scanner.nextLine();
                    String newPhone = scanner.nextLine();
                    student.setPhone(newPhone);
                    System.out.println("Phone no. Updated Successfully!");
                    System.out.println(student);
                    break;
                case 6:
                    System.out.println("Enter Email. to Update: ");
                    scanner.nextLine();
                    String newEmail = scanner.nextLine();
                    student.setEmail(newEmail);
                    ;
                    System.out.println("Email Updated Successfully!");
                    System.out.println(student);
                    break;

                default:
                    System.out.println("Invalid update option.");
            }

        }
    }

    public void deleteStudent(int rollNumber) {

        int studentIndex = searchStudentIndex(rollNumber);

        if (studentIndex != -1) {
            students.remove(studentIndex);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found. ");
        }

    }

    public int searchStudentIndex(int rollNumber) {

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getRoll() == rollNumber) {
                return i;
            }
        }
        return -1;
    }

    private int getValidRollNumber() {

        int rollNumber;
        // scanner.nextLine();

        do {
            System.out.println("Enter Roll No.: ");
            rollNumber = scanner.nextInt();
            if (rollNumber < 1) {
                System.out.println("Enter a valid RollNumber: ");
                continue;

            }

            // int rollNumber = scanner.nextInt();
            if (searchStudent(rollNumber) != null) {
                System.out.println("Roll number already exists! ");
                // return;
                continue;
            }

            // return rollNumber;

            return rollNumber;

        } while (true);

    }

    private String getValidName(){
        String name;
        do {
            boolean isValid = true;
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            
            name = name.trim();
            if (name.isBlank()) {
                System.out.println("Name can't be blank ");
                continue;
            }
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                
                if (!Character.isWhitespace(ch) && !Character.isLetter(ch)) {
                    System.out.println("Invalid name, try again: ");
                    isValid = false;
                    break;
                }
            }
            if (isValid ) {
                return name;
            }

            
        } while (true);


        
    }
}
