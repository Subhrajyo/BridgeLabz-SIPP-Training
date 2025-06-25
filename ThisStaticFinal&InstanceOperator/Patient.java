public class Patient {
    // Static variable shared among all patients
    static String hospitalName = "abc hospital";
    // Static variable to count total patients
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    // Final variable for unique patient ID
    private final String patientID;

    // Constructor using 'this' to initialize fields
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    // Method to display patient details
    public void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("John", 30, "Fever", "P001");
        Patient p2 = new Patient("Mary", 25, "Cold", "P002");

        // Using instanceof to check before displaying details
        if (p1 instanceof Patient) {
            p1.displayDetails();
        }
        if (p2 instanceof Patient) {
            p2.displayDetails();
        }

        // Display total patients using static method
        Patient.getTotalPatients();
    }
}