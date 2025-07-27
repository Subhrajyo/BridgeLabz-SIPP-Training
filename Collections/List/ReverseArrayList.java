import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);

        int left = 0, right = arrayList.size() - 1;
        while (left < right) {
            // Swap elements at left and right indexes
            int temp = arrayList.get(left);
            arrayList.set(left, arrayList.get(right));
            arrayList.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed ArrayList: " + arrayList);
    }
}
