import java.util.Scanner;

public class Question12_StringLengthWithoutLength {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        int customLength = findLengthWithoutLength(input);
        int builtInLength = input.length();
        
        System.out.println("Length of the string using custom method: " + customLength);
        System.out.println("Length of the string using built-in method: " + builtInLength);
    }

    public static int findLengthWithoutLength(String str) {
        int count = 0;
        while (count < str.toCharArray().length) {
            count++;
        }
        return count;
    }
}