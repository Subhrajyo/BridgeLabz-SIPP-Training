
import java.util.Scanner;

public class Question_07{
    public static int handShake(int no){
        if(no<0){
            return 0;

        }
        return no * (no - 1) / 2;   
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of people: ");
        int no = sc.nextInt();
         int handshakes = handShake(no);
        System.out.println("Total handshakes possible: " + handshakes);  
    }
}