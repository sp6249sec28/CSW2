public class q28 {

    public static void main(String[] args) {
        try {
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow error occurred: " + e.getMessage());
        }
    }

    public static void recursiveMethod(int count) {
        System.out.println("Count: " + count);
        recursiveMethod(count + 1); // Recursive call
    }
}