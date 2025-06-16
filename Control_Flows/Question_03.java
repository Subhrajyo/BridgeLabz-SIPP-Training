import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int n = Integer.parseInt(input);
            if (n >= 0) {
                int sum = n * (n + 1) / 2;
                System.out.println("The sum of " + n + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + n + " is not a natural number");
            }
        } catch (NumberFormatException e) {
            System.out.println("The number " + input + " is not a natural number");
        }
    }
}