public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Default radius: " + c1.radius);

        Circle c2 = new Circle(5.5);
        System.out.println("Custom radius: " + c2.radius);
    }
}