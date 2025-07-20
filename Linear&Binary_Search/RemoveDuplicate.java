import java.util.HashSet;

public class RemoveDuplicate {
    public static String removeduplicate(String input){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> seen=new HashSet<>();
        for (char ch:input.toCharArray()){
            if(!seen.contains(ch)){
                sb.append(ch);
                seen.add(ch);
            }
        }
        return sb.toString();
    }
}
