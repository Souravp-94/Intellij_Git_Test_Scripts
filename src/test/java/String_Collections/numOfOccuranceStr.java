package String_Collections;

import java.util.HashMap;
import java.util.Map;

public class numOfOccuranceStr {
    public static void main(String[] args) {
        String sentence = "Hello World";
        Map<Character, Integer> alphabetCounts = countAlphabets(sentence);

        // Print the counts
        System.out.println("Alphabet Counts:");
        for (Map.Entry<Character, Integer> entry : alphabetCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countAlphabets(String sentence) {
        Map<Character, Integer> alphabetCounts = new HashMap<>();

        // Convert the sentence to lowercase to handle case-insensitivity
        sentence = sentence.toLowerCase();

        // Iterate through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // Exclude spaces
            if (ch != ' ') {
                // Increment the count of the alphabet
                alphabetCounts.put(ch, alphabetCounts.getOrDefault(ch, 0) + 1);
            }
        }
        return alphabetCounts;
    }
}