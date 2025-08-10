import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String fileName = "data.txt"; // File to read

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line
            }

        } catch (IOException e) {
            System.out.println("File not found"); // Friendly message
        }
    }
}
