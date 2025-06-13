import java.util.Scanner;
public class CelsiusToFirenhight{

      public static void main(String[] args){

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter celsius scale:");

      double celsius=sc.nextDouble();

      double Fahrenheit = (celsius * 9/5) + 32;

      System.out.println(Fahrenheit);   
}
 }