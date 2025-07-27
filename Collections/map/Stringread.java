public class Stringread {
    Map<String, Integer> wordCount = new HashMap<>();

    // Sample input text
    String text = "Hello world, hello Java!";

// Convert to lowercase and remove punctuation
    text = text.toLowerCase().replaceAll("[^a-z ]", "");

    // Split into words
    String[] words = text.split("\\s+");

// Count word frequencies
for (String word : words) {
        if (word.isEmpty()) continue;
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }

}
