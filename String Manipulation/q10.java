//String Rotation Checker
public class q10 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "leapp";

        if (areRotations(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are rotations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not rotations of each other.");
        }
    }

    public static boolean areRotations(String str1, String str2) {
        // Check if lengths are equal and not empty
        if (str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenated = str1 + str1;

        // Check if str2 is a substring of concatenated str1
        return concatenated.contains(str2);
    }
}