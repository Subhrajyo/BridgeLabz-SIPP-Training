import java.util.Random;

public class Question_30 {

    public static int[] generateHeights(int n) {
        Random rand = new Random();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int v : arr) total += v;
        return total;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int v : arr) if (v < min) min = v;
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int v : arr) if (v > max) max = v;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();
        System.out.println("Shortest height: " + min(heights));
        System.out.println("Tallest height: " + max(heights));
        System.out.printf("Mean height: %.2f\n", mean(heights));
    }
}