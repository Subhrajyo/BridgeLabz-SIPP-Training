import java.util.Scanner;

public class QuotientAndReminde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d%n", quotient, remainder, dividend, divisor);
    }
}