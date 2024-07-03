package nirmittandel_sec001_ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordTypeCount {

	public static void main(String[] args) {
        // Create a Scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        
        // Read the input string from the user
        String input = scanner.nextLine();
        
        // Close the scanner to avoid resource leaks
        scanner.close();

        // Split the input string into an array of words using whitespace as a delimiter
        String[] words = input.split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word in the input
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        // Display the word count map
        System.out.println("Map contains:");
        System.out.println("Key\tValue");

        // Print each entry in the word count map
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        // Display the size and emptiness of the word count map
        System.out.println("size: " + wordCountMap.size());
        System.out.println("isEmpty: " + wordCountMap.isEmpty());

        // Find words with the minimum number of repeats
        int minRepeats = Integer.MAX_VALUE;
        List<String> duplicates = new ArrayList<>();

        // Iterate over the word count map to find words with minimum repeats
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            int count = entry.getValue();
            if (count > 1) {
                // Update minRepeats and clear the duplicates list if a new minimum is found
                if (count < minRepeats) {
                    minRepeats = count;
                    duplicates.clear();
                }
                
                // Add words with the current minimum repeats to the duplicates list
                if (count == minRepeats) {
                    duplicates.add(entry.getKey());
                }
            }
        }
        // The 'duplicates' list now contains words with the minimum number of repeats
    }
}