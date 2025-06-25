public class Book {
    // Static variable shared across all books
    static String libraryName = "BridgeLabz Library";

    // Final variable for unique identifier
    private final String isbn;
    private String title;
    private String author;

    // Constructor using 'this' to initialize fields
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "9780132350884");

        // Display library name using static method
        Book.displayLibraryName();

        // Using instanceof to check before displaying details
        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}