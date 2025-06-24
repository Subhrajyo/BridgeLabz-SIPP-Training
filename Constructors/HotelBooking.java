public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Default: " + booking1.guestName + ", " + booking1.roomType + ", " + booking1.nights);

        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Parameterized: " + booking2.guestName + ", " + booking2.roomType + ", " + booking2.nights);

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Copy: " + booking3.guestName + ", " + booking3.roomType + ", " + booking3.nights);
    }
}