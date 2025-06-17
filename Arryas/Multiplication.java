
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] numbers = new int[10];
        for(int i=1;i<=10;i++){
          numbers[i-1] = i*n;  

        }
        System.out.println("Multiplication table of " + n + ":");
        for(int i=0;i<numbers.length;i++){
            System.out.println(n + " * " + (i+1) + " = " + numbers[i]);
        }
    }
}