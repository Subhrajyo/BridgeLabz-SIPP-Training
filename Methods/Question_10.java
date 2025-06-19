import java.util.Scanner;
public class Question_10{
    public static int sum(int num){
        if(num <= 0){
            return 0;
        }
        return num + sum(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        if(num < 0){

            System.out.println("Please enter a positive integer.");
        } else {
            int result = sum(num);
            System.out.println("The sum of all integers from 1 to " + num + " is: " + result);
        }
    }
}