import java.util.Random;

public class Question_27 {

    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = rand.nextInt(90000) + 10000; 
            data[i][1] = rand.nextInt(11);
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double bonus = data[i][1] > 5 ? data[i][0] * 0.05 : data[i][0] * 0.02;
            result[i][0] = bonus;
            result[i][1] = data[i][0] + bonus;
        }
        return result;
    }

    public static void displaySummary(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOldSalary\tYears\tBonus\t\tNewSalary");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n", i + 1, data[i][0], data[i][1], result[i][0], result[i][1]);
            totalOld += data[i][0];
            totalNew += result[i][1];
            totalBonus += result[i][0];
        }
        
        System.out.printf("Total\t%.2f\t\t\t%.2f\t\t%.2f\n", totalOld, totalBonus, totalNew);
    }

    public static void main(String[] args) {
        int[][] data = generateEmployeeData(10);
        double[][] result = calculateBonusAndNewSalary(data);
        displaySummary(data, result);
    }
    }