//Duplicate Character Remover
public class q6 {
    public static void main(String[] args) {
        String input = "shivam patnaik";
        String result = removeDuplicates(input);
        System.out.println("String with duplicates removed: " + result);
    }

    public static String removeDuplicates(String str) {
        // Convert string to char array
        char[] charArray = str.toCharArray();
        
        // Create a StringBuilder to store unique characters
        StringBuilder uniqueChars = new StringBuilder();
        
        // Create a boolean array to track characters already encountered
        boolean[] encountered = new boolean[256]; // Assuming ASCII characters
        
        // Iterate through the characters of the string
        for (char c : charArray) {
            // If the character hasn't been encountered yet, append it to the result and mark it as encountered
            if (!encountered[c]) {
                uniqueChars.append(c);
                encountered[c] = true;
            }
        }
        
        return uniqueChars.toString();
    }
}