import java.util.Scanner;

public class Running{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the park in meters: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2 of the park in meters: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3 of the park in meters: ");
        int c = sc.nextInt();

        int perimeter = a + b + c;
        double totalDistance = 5000.0; 
        double rounds = totalDistance / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);
    }
}