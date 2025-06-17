
import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] fizzBuzzArray = new String[100];
    int num=sc.nextInt();
    int idx=0;
    for(int i=0;i<=num;i++){
       if(i% 3 == 0 && i % 5 == 0) {
            fizzBuzzArray[idx++] = "FizzBuzz";
        } else if (i % 3 == 0) {
            fizzBuzzArray[idx++] = "Fizz";
        } else if (i % 5 == 0) {
            fizzBuzzArray[idx++] = "Buzz";
        } else {
            fizzBuzzArray[idx++] = String.valueOf(i);
        }
    }
    System.out.println("FizzBuzz output:");

    for (int i = 0; i < idx; i++) {
        System.out.println(fizzBuzzArray[i]);
    }
}
}