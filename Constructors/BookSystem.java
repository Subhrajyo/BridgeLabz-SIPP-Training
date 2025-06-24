public class BookSystem {
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    public BookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }

    public static void main(String[] args) {
        BookSystem book1 = new BookSystem("The Alchemist", "Paulo Coelho", 299.0, true);
        System.out.println("Availability before borrowing: " + book1.available);
        book1.borrowBook();
        System.out.println("Availability after borrowing: " + book1.available);
        book1.borrowBook();
    }
}