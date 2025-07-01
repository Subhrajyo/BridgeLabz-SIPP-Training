import java.util.Scanner;

// Abstract class
abstract class Employee {
    String name;
    String id;
    int salary;

    Employee(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract void displayDetails();
}

// Subclass: Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, String id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        System.out.println("\n----- Manager Details -----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass: Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, String id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        System.out.println("\n----- Developer Details -----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass: Intern
class Intern extends Employee {
    String mentorName;

    Intern(String name, String id, int salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    void displayDetails() {
        System.out.println("\n----- Intern Details -----");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Mentor Name: " + mentorName);
    }
}

// Main class
 class Mains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Manager Input
        System.out.print("Enter Manager Name: ");
        String mName = sc.nextLine();

        System.out.print("Enter Manager ID: ");
        String mId = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        int mSalary = sc.nextInt();

        System.out.print("Enter Manager Team Size: ");
        int mTeamSize = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Developer Input
        System.out.print("\nEnter Developer Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter Developer ID: ");
        String dId = sc.nextLine();

        System.out.print("Enter Developer Salary: ");
        int dSalary = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Developer Programming Language: ");
        String language = sc.nextLine();

        // Intern Input
        System.out.print("\nEnter Intern Name: ");
        String iName = sc.nextLine();

        System.out.print("Enter Intern ID: ");
        String iId = sc.nextLine();

        System.out.print("Enter Intern Salary: ");
        int iSalary = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Intern Mentor Name: ");
        String mentor = sc.nextLine();

        // Create objects
        Manager manager = new Manager(mName, mId, mSalary, mTeamSize);
        Developer developer = new Developer(dName, dId, dSalary, language);
        Intern intern = new Intern(iName, iId, iSalary, mentor);

        // Display details
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

        sc.close();
    }
}
