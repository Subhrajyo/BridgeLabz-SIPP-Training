
import java.util.Scanner;

public class Question_23{
    public static boolean canVote(int age){
        return age>=18;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if(canVote(sc.nextInt())){
                System.out.println("Person with age  can vote.");
            } else {
                System.out.println("Person with age  cannot vote.");
            }
        }
    }
}