import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();   
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // int c= a;
        // a = b;
        // b = c;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}