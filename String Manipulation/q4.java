//Acronym Generator
public class q4 {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String acronym = generateAcronym(sentence);
        System.out.println("Acronym: " + acronym);
    }

    public static String generateAcronym(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Create a StringBuilder to build the acronym
        StringBuilder acronymBuilder = new StringBuilder();
        
        // Iterate through the words and append the first character of each word in uppercase to the acronym
        for (String word : words) {
            // Skip empty words
            if (!word.isEmpty()) {
                acronymBuilder.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return acronymBuilder.toString();
    }
}