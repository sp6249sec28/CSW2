//Vowel Counter
public class q2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }

    public static int countVowels(String str) {
        // Convert string to lowercase
        str = str.toLowerCase();
        
        // Initialize vowel count
        int count = 0;
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
