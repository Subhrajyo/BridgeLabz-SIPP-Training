import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1500.0, "CARPOLICY9876"));
        vehicles.add(new Bike("BIKE456", 500.0, "BIKEPOLICY1234"));
        vehicles.add(new Truck("TRUCK789", 3000.0, "TRUCKPOLICY5678"));

        int rentalDays = 5;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost for " + rentalDays + " days: ₹" + v.calculateRentalCost(rentalDays));

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                System.out.println("Insurance Cost: ₹" + insurable.calculateInsurance());
                System.out.println("Insurance Details: " + insurable.getInsuranceDetails());
            }

            System.out.println("--------------------------------------------------");
        }
    }
}
