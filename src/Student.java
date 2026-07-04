public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String branch;
    private int semester;
    private String phoneNumber;
    private String email;

    Student(String name,
            int rollNumber,
            int age,
            String branch,
            int semester,
            String phoneNumber,
            String email) {
        setName(name);
        setRollNumber(rollNumber);
        setAge(age);
        setBranch(branch);
        setSem(semester);
        setPhone(phoneNumber);
        setEmail(email);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Invalid name!");
            return;
        }

        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRollNumber(int rollNumber){
        if (rollNumber <= 0 ) {
            System.out.println("Invalid Roll Number!");
            return;
        }

        this.rollNumber = rollNumber;
    }
    public int getRoll(){
        return rollNumber;
    }
    public void setAge(int age){
        if (age <=0) {
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public String getBranch(){
        return branch;
    }
    public void setSem(int sem){
        this.semester = sem;
    }
    public int getSem(){
        return semester;
    }
    public void setPhone(String phone){
          if (phone.length() != 10) {
        System.out.println("Phone number must contain exactly 10 digits.");
        return;
    }

    for (int i = 0; i < phone.length(); i++) {
        if (!Character.isDigit(phone.charAt(i))) {
            System.out.println("Phone number should contain only digits.");
            return;
        }
    }

    this.phoneNumber = phone;
    }
    public String getPhone(){
        return phoneNumber;
    }
    public void setEmail(String email){
        if (email != null &&
        email.contains("@") &&
        email.contains(".")) {

        this.email = email;
    } else {
        System.out.println("Invalid email.");
    }
    }
    public String getEmail(){
        return email;
    }
}
