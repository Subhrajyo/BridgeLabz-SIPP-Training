public class ReverseString {
    public static String Reverse(String input){
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();
    }
}
