public class q26 {

    public static void main(String[] args) {
        try {
            // Trying to load a class that doesn't exist
            Class.forName("NonexistentClass");
        } catch (ClassNotFoundException e) {
            // Catching ClassNotFoundException
            System.out.println("Class not found: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}