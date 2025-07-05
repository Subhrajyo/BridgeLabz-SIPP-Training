class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 2000; // Additional handling fee
    }

    @Override
    public double calculateInsurance() {
        return 10000.0; // Flat insurance rate for trucks
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
