public class Question04_ArrayIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + e.getMessage());
        }
    }
}