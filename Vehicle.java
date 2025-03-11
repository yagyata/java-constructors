class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all instances)
    private static double registrationFee = 500.0; // Fixed registration fee for all vehicles

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Phil Dunphy", "Car");
        Vehicle v2 = new Vehicle("Jake Peralta", "Motorcycle");

        // Display vehicle details before updating registration fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(600.0);

        // Display vehicle details after updating registration fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

/*
Owner Name: Phil Dunphy
Vehicle Type: Car
Registration Fee: 500.0

Owner Name: Jake Peralta
Vehicle Type: Motorcycle
Registration Fee: 500.0

Owner Name: Phil Dunphy
Vehicle Type: Car
Registration Fee: 600.0

Owner Name: Jake Peralta
Vehicle Type: Motorcycle
Registration Fee: 600.0
*/