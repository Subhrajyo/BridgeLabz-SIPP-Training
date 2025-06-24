class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket() {
        this.movieName = "";
        this.seatNumber = -1;
        this.price = 0.0;
    }

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: ₹" + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.bookTicket("Interstellar", 15, 250.00);
        ticket.displayDetails();
    }
}