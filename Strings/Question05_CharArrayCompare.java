import java.util.Scanner;

public class Question05_CharArrayCompare {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        char[] customCharArray = getCharArray(input);
        char[] builtInCharArray = input.toCharArray();
        
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);
        
        System.out.println("Custom char array: " + new String(customCharArray));
        System.out.println("Built-in char array: " + new String(builtInCharArray));
        System.out.println("Are both char arrays equal? " + areEqual);
        
        scanner.close();
    }
    
    public static char[] getCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}