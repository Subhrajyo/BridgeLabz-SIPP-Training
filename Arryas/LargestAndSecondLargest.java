import java.util.Scanner;
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Please enter at least two numbers.");
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for(int i=0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            } else if(numbers[i] > secondLargest && numbers[i] < largest){
                secondLargest = numbers[i];
            }
        }
        System.err.println("Largest number: " + largest
                + "\nSecond largest number: " + secondLargest);
    }
}