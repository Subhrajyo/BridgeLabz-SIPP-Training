import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);

        int left = 0, right = linkedList.size() - 1;
        while (left < right) {
            // Swap elements at left and right indexes
            int temp = linkedList.get(left);
            linkedList.set(left, linkedList.get(right));
            linkedList.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed LinkedList: " + linkedList);
    }
}
