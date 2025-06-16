
import java.util.Scanner;

public class Question_04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if(Math.min(num1, Math.min(num2, num3)) == num1) {
            System.out.println(num1 + " is the smallest number");
       
        } else {
            System.out.println("num1 is not the smallest number");
        }
    }
}
