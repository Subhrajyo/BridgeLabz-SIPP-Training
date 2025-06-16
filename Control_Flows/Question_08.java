import java.util.Scanner;
public class Question_08{
    public static void main(String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number :");
            int n = sc.nextInt();
            int f = 1; 
            if(n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                
            }
            while(n>0){
                 n--;
                f = f * (n + 1);
                
            }
            System.out.println("The factorial of the number is: " + f);
        }
    }
}