public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    //Default constructor
    public HotelBooking(){
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 0;
    }
    //Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    //Copying constructors
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void displayBookings(){
        System.out.println("Guest's Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Total Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookings();

        System.out.println();

        HotelBooking booking2 = new HotelBooking("Yagyata", "Deluxe", 4);
        booking2.displayBookings();

        System.out.println();

        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookings();
    }
}

/*
Guest's Name: Unknown
Room Type: Standard
Total Nights: 0

Guest's Name: Yagyata
Room Type: Deluxe
Total Nights: 4

Guest's Name: Yagyata
Room Type: Deluxe
Total Nights: 4
*/