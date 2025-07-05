import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(101, "Alice", 30000, 5000);
        fte.assignDepartment("Engineering");

        PartTimeEmployee pte = new PartTimeEmployee(102, "Bob", 10000, 40, 200);
        pte.assignDepartment("Support");

        employeeList.add(fte);
        employeeList.add(pte);

        // Polymorphic behavior
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
