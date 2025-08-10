
import java.util.*;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
           int numetor=sc.nextInt();
           int dinominator=sc.nextInt();
           int res=numetor/dinominator;
            System.out.println(res);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch (InputMismatchException ae){
            System.out.println("Input error: Please enter valid integers.");
        }

    }
}
