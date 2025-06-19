import java.util.Scanner;

public class Question_04 {

    public static void printTrigonometricValues(double degrees) {
        double radians = Math.toRadians(degrees);
        System.out.println("sin(" + degrees + ") = " + Math.sin(radians));
        System.out.println("cos(" + degrees + ") = " + Math.cos(radians));
        System.out.println("tan(" + degrees + ") = " + Math.tan(radians));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double degrees = scanner.nextDouble();

        printTrigonometricValues(degrees);

      
    }
}