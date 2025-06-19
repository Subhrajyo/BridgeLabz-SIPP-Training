import java.util.Scanner;

public class Question17_ShortestLongestWord {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scanner.nextLine();
        
        String[] words = splitWords(input);
        String[] lengths = getWordLengths(words);
        
        String[] shortestLongest = findShortestAndLongest(words, lengths);
        
        System.out.println("Shortest word: " + shortestLongest[0]);
        System.out.println("Longest word: " + shortestLongest[1]);
        
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
            if (text.charAt(i) != ' ') {
                currentWord.append(text.charAt(i));
            } else {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0);
            }
        }
        words[wordIndex] = currentWord.toString(); 
        
        return words;
    }
    
    public static String[] getWordLengths(String[] words) {
        String[] lengths = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            lengths[i] = String.valueOf(words[i].length());
        }
        return lengths;
    }
    
    public static String[] findShortestAndLongest(String[] words, String[] lengths) {
        String shortest = words[0];
        String longest = words[0];
        
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        
        return new String[] { shortest, longest };
    }
}