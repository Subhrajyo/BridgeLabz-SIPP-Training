public class Product {
    // Static variable shared by all products
    static double discount = 10.0; // in percentage

    // Final variable for unique product ID
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize fields
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product prod1 = new Product(1, "Laptop", 50000.0, 2);
        Product prod2 = new Product(2, "Smartphone", 20000.0, 5);

        // Update discount using static method
        Product.updateDiscount(15.0);

        // Using instanceof to check before displaying details
        if (prod1 instanceof Product) {
            prod1.displayDetails();
        }
        if (prod2 instanceof Product) {
            prod2.displayDetails();
        }
    }
}