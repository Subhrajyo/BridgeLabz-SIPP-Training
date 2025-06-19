
import java.util.Scanner;

public class Question_02{

    public static void  numberdect(int num){
      if(num >0){
          System.out.println("Positive");
      } else if(num < 0){
          System.out.println("Negative");
      } else {
          System.out.println("Zero");
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        numberdect(num);
        
    }
}