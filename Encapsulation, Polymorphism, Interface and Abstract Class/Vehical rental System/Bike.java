class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000.0; // Flat insurance rate for bikes
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
