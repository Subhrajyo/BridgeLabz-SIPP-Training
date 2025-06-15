import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        int heightInCm = scanner.nextInt();

        double totalInches = heightInCm / 2.54;
        int feet = (int) (totalInches / 12);
        int inches = (int) Math.round(totalInches % 12);

        System.out.println("Your height is " + feet + " feet and " + inches + " inches.");
    }
}