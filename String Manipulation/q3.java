//Word Reversal
public class q3 {
    public static void main(String[] args) {
        String sentence = "Hello world! This is a sentence";
        String reversed = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversed);
    }

    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Create a StringBuilder to build the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            // Add space if it's not the last word
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        
        return reversedSentence.toString();
    }
}
