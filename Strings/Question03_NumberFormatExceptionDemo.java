import java.util.Scanner;

public class Question03_NumberFormatExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();

        try {
            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}