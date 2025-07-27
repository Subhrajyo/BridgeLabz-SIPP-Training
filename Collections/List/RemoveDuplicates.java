import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);

        List<Integer> result = removeDuplicatesPreserveOrder(inputList);
        System.out.println("Result: " + result);
    }

    public static List<Integer> removeDuplicatesPreserveOrder(List<Integer> list) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer num : list) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }

        return result;
    }
}
