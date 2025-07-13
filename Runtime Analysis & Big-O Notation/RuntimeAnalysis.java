import java.io.*;
import java.util.*;

public class RuntimeAnalysis {

    // 1. Linear Search
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr)
            if (num == target) return true;
        return false;
    }

    // 1. Binary Search
    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    // 2. Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            if (!swapped) break;
        }
    }

    // 2. Merge Sort
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length)
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // 2. Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++)
            if (arr[j] < pivot)
                swap(arr, ++i, j);
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    // 3. String Concatenation Comparison
    public static void stringConcatenation(int count) {
        long start, end;

        // String
        start = System.nanoTime();
        String s = "";
        for (int i = 0; i < count; i++) s += "a";
        end = System.nanoTime();
        System.out.println("String: " + (end - start) / 1_000_000 + " ms");

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1_000_000 + " ms");

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < count; i++) sbuf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) / 1_000_000 + " ms");
    }

    // 4. File Reading Comparison
    public static void fileReadingComparison(File file) throws Exception {
        long start, end;

        // FileReader
        start = System.nanoTime();
        FileReader fr = new FileReader(file);
        while (fr.read() != -1);
        fr.close();
        end = System.nanoTime();
        System.out.println("FileReader: " + (end - start) / 1_000_000 + " ms");

        // InputStreamReader
        start = System.nanoTime();
        InputStreamReader ir = new InputStreamReader(new FileInputStream(file));
        while (ir.read() != -1);
        ir.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader: " + (end - start) / 1_000_000 + " ms");
    }

    // 5. Fibonacci Recursive
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // 5. Fibonacci Iterative
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b; b = sum;
        }
        return b;
    }

    // 6. Data Structure Search
    public static void searchComparison(int[] arr, int target) {
        long start, end;

        // Array
        start = System.nanoTime();
        for (int x : arr) if (x == target) break;
        end = System.nanoTime();
        System.out.println("Array search: " + (end - start) / 1_000_000.0 + " ms");

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        for (int x : arr) hashSet.add(x);
        start = System.nanoTime();
        hashSet.contains(target);
        end = System.nanoTime();
        System.out.println("HashSet search: " + (end - start) / 1_000_000.0 + " ms");

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        for (int x : arr) treeSet.add(x);
        start = System.nanoTime();
        treeSet.contains(target);
        end = System.nanoTime();
        System.out.println("TreeSet search: " + (end - start) / 1_000_000.0 + " ms");
    }

    public static void main(String[] args) throws Exception {
        int N = 1_000_000;
        int[] dataset = new Random().ints(N, 1, N).toArray();
        int target = dataset[N / 2];

        System.out.println("1️⃣ Search Comparison:");
        long start = System.nanoTime();
        linearSearch(dataset, target);
        long end = System.nanoTime();
        System.out.println("Linear Search: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        binarySearch(dataset, target);
        end = System.nanoTime();
        System.out.println("Binary Search: " + (end - start) / 1_000_000.0 + " ms");

        System.out.println("\n2️⃣ Sorting Algorithms:");
        int[] bubble = Arrays.copyOf(dataset, 1000); // Only 1K for bubble
        int[] merge = Arrays.copyOf(dataset, 100000);
        int[] quick = Arrays.copyOf(dataset, 100000);

        start = System.nanoTime();
        bubbleSort(bubble);
        end = System.nanoTime();
        System.out.println("Bubble Sort (1K): " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        mergeSort(merge, 0, merge.length - 1);
        end = System.nanoTime();
        System.out.println("Merge Sort (100K): " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        quickSort(quick, 0, quick.length - 1);
        end = System.nanoTime();
        System.out.println("Quick Sort (100K): " + (end - start) / 1_000_000.0 + " ms");

        System.out.println("\n3️⃣ String Concatenation:");
        stringConcatenation(100000);

        System.out.println("\n4️⃣ File Reading (Create a dummy 100MB+ file and pass its path):");
        // fileReadingComparison(new File("path/to/largefile.txt"));

        System.out.println("\n5️⃣ Fibonacci Comparison:");
        start = System.nanoTime();
        System.out.println("Fibonacci Iterative(50): " + fibonacciIterative(50));
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        System.out.println("Fibonacci Recursive(30): " + fibonacciRecursive(30));
        end = System.nanoTime();
        System.out.println("Recursive Time (30): " + (end - start) / 1_000_000.0 + " ms");

        System.out.println("\n6️⃣ Search in Data Structures:");
        searchComparison(dataset, target);
    }
}
