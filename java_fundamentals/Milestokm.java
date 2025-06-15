
import java.util.Scanner;

public class Milestokm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double miles = sc.nextDouble(); 
        double kilometers = miles * 1.60934; 
        System.out.printf("%.2f miles is equal to %.2f kilometers\n", miles, kilometers);
    }
}