import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary (INR): ");
        int salary = scanner.nextInt();

        System.out.print("Enter the bonus (INR): ");
        int bonus = scanner.nextInt();

        int totalIncome = salary + bonus;

        System.out.printf("The salary is INR %d and the bonus is INR %d. Hence Total Income is INR %d%n", salary, bonus, totalIncome);
    }
}