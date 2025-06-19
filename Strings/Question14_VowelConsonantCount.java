import java.util.Scanner;

public class Question14_VowelConsonantCount {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        
        
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (isVowel(ch)) {
                vowelsCount++; 
            } else if (isConsonant(ch)) {
                consonantsCount++;
            }
        }

        return new int[]{vowelsCount, consonantsCount};
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z') && !isVowel(ch);
    }
}