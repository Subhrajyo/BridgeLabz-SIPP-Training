import java.util.Scanner;

public class Question09_LowercaseCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String customLowercase = toLowercase(input);
        
        String builtInLowercase = input.toLowerCase();
      
        boolean areEqual = compareStrings(customLowercase, builtInLowercase);
       
        System.out.println("Custom Lowercase: " + customLowercase);
        System.out.println("Built-in Lowercase: " + builtInLowercase);
        System.out.println("Are both lowercase strings equal? " + areEqual);
        
        scanner.close();
    }
    
    public static String toLowercase(String str) {
        StringBuilder lowerStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           
            if (ch >= 'A' && ch <= 'Z') {
                
                ch = (char) (ch + 32);
            }
            lowerStr.append(ch);
        }
        return lowerStr.toString();
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