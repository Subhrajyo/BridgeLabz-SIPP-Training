import java.util.*;
public class Volume{

      public static void main(String[] args){

      Scanner sc=new Scanner(System.in);

      System.out.print("Enter Radius of cylinder:");

      double radius=sc.nextDouble();
      System.out.print("Enter Height of cylinder:");

      double height=sc.nextDouble();


      double volume = 3.14 * Math.pow(radius,2.0)*height;

      System.out.println(volume);   
}
 }