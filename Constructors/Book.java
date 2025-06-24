public class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Atomic habit", "james clear", 150.00);
        System.out.println(book1.author);
        System.out.println(book1.title);
        System.out.println(book1.price);

        Book book2 = new Book();
        System.out.println(book2.author);
        System.out.println(book2.title);
        System.out.println(book2.price);
    }
}