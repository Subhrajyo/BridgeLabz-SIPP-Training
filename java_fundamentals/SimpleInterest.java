public class SimpleInterest {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the principal amount (INR): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("The simple interest for a principal amount of INR %.2f at a rate of %.2f%% for %.2f years is INR %.2f%n",
                principal, rate, time, simpleInterest);
    }
}