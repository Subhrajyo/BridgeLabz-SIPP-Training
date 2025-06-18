import java.util.Scanner;

public class Question13_SplitWordsCompare {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();
        
        String[] customSplitWords = splitWordsCustom(inputText);
        String[] builtInSplitWords = inputText.split(" ");
        
        boolean areEqual = compareWordArrays(customSplitWords, builtInSplitWords);
        
        System.out.println("Custom Split Words:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nBuilt-in Split Words:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }
        
        System.out.println("\nAre the two methods' results equal? " + areEqual);
        
        
    }
    
    public static String[] splitWordsCustom(String text) {
        int wordCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0 || (text.charAt(i) != ' ' && text.charAt(i - 1) == ' ')) {
                wordCount++;
            }
        }
        
        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder currentWord = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                if (currentWord.length() > 0) {
                    words[index++] = currentWord.toString();
                    currentWord.setLength(0);
                }
            }
        }
        
        if (currentWord.length() > 0) {
            words[index] = currentWord.toString();
        }
        
        return words;
    }
    
    public static boolean compareWordArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }
}