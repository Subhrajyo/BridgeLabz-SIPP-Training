import java.util.LinkedList;
import java.util.Iterator;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int N = 2;

        String result = getNthFromEnd(list, N);
        System.out.println("Nth element from end: " + result);
    }

    public static String getNthFromEnd(LinkedList<String> list, int N) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        // Advance 'first' N steps ahead
        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return null;  // N is larger than list size
            }
            first.next();
        }

        // Move both iterators until 'first' reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // 'second' now points to the Nth element from the end
        return second.next();
    }
}
