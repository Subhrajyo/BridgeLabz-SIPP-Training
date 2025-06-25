public class Vehicle {
    // Static variable common for all vehicles
    static double registrationFee = 5000.0;

    // Final variable for unique registration number
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize fields
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Alice", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Bob", "Bike", "MH14XY5678");

        // Update registration fee
        Vehicle.updateRegistrationFee(6000.0);

        // Using instanceof to check before displaying details
        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }
        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }
    }
}