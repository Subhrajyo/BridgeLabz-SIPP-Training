public class Student {
    // Static variable shared across all students
    static String universityName = "BridgeLabz University";
    // Static variable to keep track of total students
    private static int totalStudents = 0;

    // Final variable for roll number
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor using 'this' to initialize fields
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println(name + "'s grade updated to: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "A");
        Student s2 = new Student("Bob", 102, "B");

        // Using instanceof to check before displaying or updating grades
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade("A+");
        }
        if (s2 instanceof Student) {
            s2.displayDetails();
            s2.updateGrade("B+");
        }

        // Display total students using static method
        Student.displayTotalStudents();
    }
}