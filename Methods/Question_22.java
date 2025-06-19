import java.util.Scanner;

public class Question_22 {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is positive and even.");
                } else {
                    System.out.println(numbers[i] + " is positive and odd.");
                }
            } else {
                System.out.println(numbers[i] + " is negative.");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than last element.");
        }
    }
}