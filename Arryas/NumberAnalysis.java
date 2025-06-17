import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); 
                i--; 
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.print("Number " + num + ": ");
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        System.out.print("Comparison of first and last element: ");
        if (first == last) {
            System.out.println("Equal");
        } else if (first > last) {
            System.out.println("First element is greater than last element");
        } else {
            System.out.println("First element is less than last element");}
            }
            }