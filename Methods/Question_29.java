
import java.util.Scanner;

public  class Question_29{
    public static boolean isPerfect(int n){
        if(n<2) 
        {
            return false;
        }
        int sum = 1; 
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }   
        return sum == n;
    }
    public static boolean  isAbundant(int n){
        if(n<2)
        {
            return false;
        }
        int sum = 1;
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum > n;
    }
    public static boolean isDeficient(int n){
        if(n<2)
        {
            return false;
        }
        int sum = 1;
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum < n;
    }
    public static boolean isStrong(int n) {
        if(n < 0) {
            return false;
        }
        int sum = 0;
        int temp = n;
        while(temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(isPerfect(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
        if(isAbundant(n)) {
            System.out.println(n + " is an abundant number.");
        } else {
            System.out.println(n + " is not an abundant number.");
        }
        if(isDeficient(n)) {
            System.out.println(n + " is a deficient number.");
        } else {
            System.out.println(n + " is not a deficient number.");
        }
        if(isStrong(n)) {
            System.out.println(n + " is a strong number.");
        } else {
            System.out.println(n + " is not a strong number.");
        }
        

    }
}