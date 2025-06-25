public class Employee {
    // Static variable shared by all employees
    static String companyName = "BridgeLabz Solutions";
    // Static variable to keep track of total employees
    private static int totalEmployees = 0;

    // Final variable for employee ID
    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this' to initialize fields
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "Developer");
        Employee emp2 = new Employee("Jane Smith", 102, "Manager");

        // Using instanceof to check before displaying details
        if (emp1 instanceof Employee) {
            emp1.displayDetails();
        }
        if (emp2 instanceof Employee) {
            emp2.displayDetails();
        }

        // Display total employees using static method
        Employee.displayTotalEmployees();
    }
}