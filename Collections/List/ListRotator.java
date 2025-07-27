import java.util.*;

public class ListRotator {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        List<Integer> rotatedList = rotateList(inputList, rotateBy);
        System.out.println("Rotated List: " + rotatedList);
    }

    public static List<Integer> rotateList(List<Integer> list, int d) {
        int n = list.size();
        d = d % n;  // Handle rotations > size

        List<Integer> rotated = new ArrayList<>();

        // Add elements from d to end
        for (int i = d; i < n; i++) {
            rotated.add(list.get(i));
        }

        // Add elements from start to d-1
        for (int i = 0; i < d; i++) {
            rotated.add(list.get(i));
        }

        return rotated;
    }
}
