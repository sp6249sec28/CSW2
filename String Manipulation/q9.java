//Most Frequent Character
import java.util.HashMap;
import java.util.Map;

public class q9 {
    public static void main(String[] args) {
        String input = "hello world";
        char mostFrequent = findMostFrequentCharacter(input);
        System.out.println("Most frequent character: " + mostFrequent);
    }

    public static char findMostFrequentCharacter(String str) {
        // Remove whitespace and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the string and count characters
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the most frequent character
        char mostFrequent = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
    }
}