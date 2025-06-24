public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.dailyRate = 1000.0; // Default daily rate
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        System.out.println("Default Rental Total Cost: " + rental1.calculateTotalCost());

        CarRental rental2 = new CarRental("Alice", "Sedan", 5, 1500.0);
        System.out.println("Custom Rental Total Cost: " + rental2.calculateTotalCost());
    }
}