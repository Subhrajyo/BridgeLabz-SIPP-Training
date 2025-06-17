import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        System.out.println("Enter the heights of 11 football players (in cm or m):");
        for (int i = 0; i < heights.length; i++) {
            try {
                heights[i] = scanner.nextDouble();
                sum += heights[i];
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
                i--; 
            }
        }
        double mean = sum / heights.length;
        System.out.printf("Mean height of the football team: %.2f%n", mean);}
        }