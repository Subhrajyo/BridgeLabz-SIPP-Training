import java.util.*;
public class Area{

      public static void main(String[] args){

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter radius of circle:");

      double redius=sc.nextDouble();

      double Area = 3.14 * Math.pow(redius,2.0);

      System.out.println(Area);   
}
 }