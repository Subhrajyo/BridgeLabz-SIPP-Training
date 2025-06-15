
import java.util.Scanner;

public class HandShake{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the number of people in the party:");
        int n=sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Total number of handshakes possible: " + handshakes);
    }
}