import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        final int EMP_COUNT = 10;
        double[][] empData = new double[EMP_COUNT][2];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            while (true) {
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                if (salary > 0) {
                    empData[i][0] = salary;
                    break;
                } else {
                    System.out.println("Please enter a valid positive salary.");
                }
            }
            while (true) {
                System.out.print("Years of Service: ");
                double years = sc.nextDouble();
                if (years >= 0) {
                    empData[i][1] = years;
                    break;
                } else {
                    System.out.println("Please enter a valid non-negative number of years.");
                }
            }
        }

        for (int i = 0; i < EMP_COUNT; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            if (years > 5) {
                bonus[i] = salary * 0.05;
            } else {
                bonus[i] = salary * 0.02;
            }
            newSalary[i] = salary + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee\tOld Salary\tBonus\t\tNew Salary");
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", (i + 1), empData[i][0], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);}
        }