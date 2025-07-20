import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String target = "java";
        int count = 0;
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            for (String word : line.split("\\s+")) {
                if (word.equalsIgnoreCase(target)) count++;
            }
        }
        reader.close();
        System.out.println("Occurrences of '" + target + "': " + count);
    }
}
