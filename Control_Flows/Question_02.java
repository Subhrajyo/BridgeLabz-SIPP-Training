
import java.util.Scanner;

public class Question_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countDown :");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}