public class q22 {
    // Method that may throw CustomCheckedException
    public static void main(String[] args) {
        int input = -5; // Example input
        try {
            // Call method that may throw CustomCheckedException
            validateInput(input);
            System.out.println("Input is valid");
        } catch (CustomCheckedException e) {
            // Handle CustomCheckedException
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void validateInput(int number) throws CustomCheckedException {
        if (number < 0) {
            // Throw CustomCheckedException if the input is negative
            throw new CustomCheckedException("Input cannot be negative");
        }
    }
}
class CustomCheckedException extends Exception {
    // Constructor with a custom error message
    public CustomCheckedException(String message) {
        super(message);
    }
}