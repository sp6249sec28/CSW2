//Palindrome Checker
public class q1 {
    public static void main(String[] args) {
        String str = "radar";
        
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove whitespace and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();
        
        // Convert string to character array
        char[] charArray = str.toCharArray();
        
        // Check if the string is a palindrome
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}