import java.util.*;
public class Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unitPrice = sc.nextInt();
        int quantity = sc.nextInt();
        int totalPrice = unitPrice * quantity;
        System.err.println("The total price is INR " + totalPrice + " if you buy " + quantity + " items at a unit price of INR " + unitPrice + ".");
     
    }
}