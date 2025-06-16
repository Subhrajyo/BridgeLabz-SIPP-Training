import java.util.Scanner;
public class Question_01{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int i = 1;
        int sum =0;
        while(i<=n){
         sum = sum + i;
            i++; 
        }
        
        int sum1= (n*(n+1))/2;
        if(sum == sum1){
            System.out.println(sum + " is the sum of first " + n + " natural numbers.");
        } else {
            System.out.println("The sum is incorrect.");
        }


    }
}