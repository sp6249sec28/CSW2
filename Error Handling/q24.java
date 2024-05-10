import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class q24 {

    public static void main(String[] args) {
        try {
            // Trying to open a file that doesn't exist
            FileInputStream fileInputStream = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            // Catching the checked exception FileNotFoundException
            System.out.println("File not found: " + e.getMessage());
        }
    }
}