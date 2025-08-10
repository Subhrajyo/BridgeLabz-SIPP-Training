import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simulate a valid array (you can also set it to null to test)
        int[] arr = {10, 20, 30, 40, 50};

        // To test null pointer, uncomment the next line:
        // arr = null;

        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            int value = arr[index];  // May throw exceptions
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
