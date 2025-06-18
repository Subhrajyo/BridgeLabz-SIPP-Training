import java.util.Scanner;

public class Question15_VowelConsonantType {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] result = findVowelConsonantType(input);
        displayResult(result);
        
        scanner.close();
    }

    public static String[][] findVowelConsonantType(String text) {
        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            result[index][0] = String.valueOf(ch);
            result[index][1] = type;
            index++;
        }
        
        return result;
    }

    public static String checkCharacterType(char ch) {
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s%n", "Character", "Type");
        System.out.println("---------------------");
        for (String[] row : result) {
            if (row[0] != null) {
                System.out.printf("%-10s %-10s%n", row[0], row[1]);
            }
        }
    }
}