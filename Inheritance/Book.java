// Superclass: Book
class Book {
    String title;
    int publicationYear;

    // Constructor for Book
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author extends Book
class Author extends Book {
    String name;
    String bio;

    // Constructor for Author (also calls Book constructor using super)
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);  // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overridden displayInfo to include author details
    @Override
    void displayInfo() {
        super.displayInfo();  // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test
 class LibrarySystem {
    public static void main(String[] args) {
        // Create object of Author class
        Author authorBook = new Author("The Alchemist", 1988, "Paulo Coelho", "Brazilian lyricist and novelist");

        // Display information
        authorBook.displayInfo();
    }
}

