import java.util.Scanner;

public class Question01_UppercaseCompare {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a complete text:");
        String inputText = scanner.nextLine();
        
        String customUppercase = convertToUppercase(inputText);
        String builtInUppercase = inputText.toUpperCase();
        
        boolean areEqual = compareStrings(customUppercase, builtInUppercase);
        
        System.out.println("Custom Uppercase: " + customUppercase);
        System.out.println("Built-in Uppercase: " + builtInUppercase);
        System.out.println("Are both uppercase results equal? " + areEqual);
        
        scanner.close();
    }
    
    public static String convertToUppercase(String text) {
        StringBuilder upperText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                upperText.append((char) (currentChar - 32));
            } else {
                upperText.append(currentChar);
            }
        }
        return upperText.toString();
    }
    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}