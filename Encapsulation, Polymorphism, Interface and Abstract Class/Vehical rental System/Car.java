class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 5000.0; // Flat insurance rate for cars
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy No: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
