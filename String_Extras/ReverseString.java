import java.util.*;

public class ReverseString{
    public static String reverseString(String input){
        
        StringBuilder sb=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--){
             sb.append(input.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result=reverseString(input);
        System.out.println(result);
    }
}