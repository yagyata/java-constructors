public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double dailyRate = 1000;

    public CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Yagyata", "Honda CR-V", 7);
        rental1.displayRentalDetails();
    }
}

/*
Customer Name: Yagyata
Car Model: Honda CR-V
Rental Days: 7
Total Cost: 7000.0
*/