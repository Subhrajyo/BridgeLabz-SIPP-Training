import java.util.Scanner;

public class Question_03 {
    
    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        double totalDistance = 5000; 

        double rounds = calculateRounds(side1, side2, side3, totalDistance);

        System.out.println("The athlete must complete " + (int)Math.ceil(rounds) + " rounds to run at least 5 km.");

        }
        }