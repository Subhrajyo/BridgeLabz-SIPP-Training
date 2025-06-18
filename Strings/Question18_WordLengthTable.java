import java.util.Scanner;

public class Question18_WordLengthTable {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        String[] words = splitWords(input);
        String[][] wordLengthTable = createWordLengthTable(words);
        
        displayWordLengthTable(wordLengthTable);
        
        scanner.close();
    }
    
    public static String[] splitWords(String text) {
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        String[] words = new String[spaceCount + 1];
        int wordIndex = 0;
        StringBuilder currentWord = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord.toString();
                    currentWord.setLength(0);
                }
            }
        }
        
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord.toString();
        }
        
        return words;
    }
    
    public static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(words[i].length());
        }
        
        return table;
    }
    
    public static void displayWordLengthTable(String[][] table) {
        System.out.printf("%-15s %s%n", "Word", "Length");
        System.out.println("-------------------------");
        for (String[] row : table) {
            System.out.printf("%-15s %s%n", row[0], row[1]);
        }
    }
}