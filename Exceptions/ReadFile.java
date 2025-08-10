import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        // Try-with-resources ensures BufferedReader is auto-closed
        try (BufferedReader br = new BufferedReader(new FileReader("info.txt"))) {
            String line = br.readLine();  // Read the first line
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
