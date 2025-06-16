
import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
         System.out.print("Enter the weight: ");
         double weight = sc.nextDouble();
         System.out.print("Enter the height: ");
            double height = sc.nextDouble();
            double bmi = weight / (height * height);
            if(bmi<=18.4){
                System.out.println("Underweight");
            } else if(bmi<=24.9){
                System.out.println("Normal weight");
            } else if(bmi<=39.9){
                System.out.println("Overweight");
            } else {
                System.out.println("Obesity");
            }
    }
}