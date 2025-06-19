import java.util.Arrays;

public class Question_15 {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * 9000) + 1000; 
        }
        return arr;
    }

    
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randomNumbers));

        double[] avgMinMax = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + avgMinMax[0]);
        System.out.println("Minimum: " + (int)avgMinMax[1]);
        System.out.println("Maximum: " + (int)avgMinMax[2]);
    }
    }