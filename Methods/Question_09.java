import java.util.Scanner;

public class Question_09 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (dividend): ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

       
    }
}