
import java.util.Scanner;

public class Question_08{
    public static double SimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");   
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();
        double interest = SimpleInterest(principal, rate, time);
        System.out.printf("The simple interest is: %.2f\n", interest);
    }
}