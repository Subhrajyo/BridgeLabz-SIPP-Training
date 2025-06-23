import java.util.*;

public class VowelConsonantCount {
    public static void getCount(String input) {
        int vcount = 0;
        int ccount = 0;
        input = input.toLowerCase(); 

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) { 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vcount++;
                } else {
                    ccount++;
                }
            }
        }

        System.out.println("Vowels: " + vcount);
        System.out.println("Consonants: " + ccount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        getCount(input);
    }
}
