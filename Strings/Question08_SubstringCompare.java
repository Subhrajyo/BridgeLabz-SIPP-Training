import java.util.Scanner;

public class Question08_SubstringCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the start index for substring: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index for substring: ");
        int endIndex = scanner.nextInt();

        String customSubstring = createSubstring(inputString, startIndex, endIndex);
        String builtInSubstring = inputString.substring(startIndex, endIndex);

        boolean areEqual = compareStrings(customSubstring, builtInSubstring);

        System.out.println("Custom Substring: " + customSubstring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
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