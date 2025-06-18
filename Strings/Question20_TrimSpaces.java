import java.util.Scanner;

public class Question20_TrimSpaces {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = scanner.nextLine();

        String trimmedCustom = trimSpaces(input);
        String trimmedBuiltIn = input.trim();
        boolean isEqual = trimmedCustom.equals(trimmedBuiltIn);
        
        System.out.println("Trimmed using custom method: '" + trimmedCustom + "'");
        System.out.println("Trimmed using built-in method: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);
        
        scanner.close();
    }
    
    public static String trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        StringBuilder trimmed = new StringBuilder();
        for (int i = start; i <= end; i++) {
            trimmed.append(str.charAt(i));
        }
        
        return trimmed.toString();
    }
}