
import java.util.Scanner;

public class FeeDiscount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee=sc.nextInt();
        int discount=sc.nextInt();
        int discountAmount = (fee * discount) / 100;
        int finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount+"and the final fee is INR " + finalFee + ".");
    }
}