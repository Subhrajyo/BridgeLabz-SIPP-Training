import java.util.Scanner;
public  class Question_13{
    public static void Factors(int number){
        int [] factors = new int[100];
        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factors[count++] = i;
               
            }
        }
        System.out.print("Factors of " + number + " are: ");
        for(int i = 0; i < count; i++){
            System.out.print(factors[i] + " ");
        }
    }
    public static int sumOfFactors(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static int SqureofFactors(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                sum += (i * i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if(number < 0){
            System.out.println("Please enter a positive integer.");
        } else {
            Factors(number);
            int sum = sumOfFactors(number);
            System.out.println("\nSum of factors: " + sum);
            int squareSum = SqureofFactors(number);
            System.out.println("Sum of squares of factors: " + squareSum);
        }
    }
}