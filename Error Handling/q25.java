import java.util.InputMismatchException;
import java.util.Scanner;

public class q25 {

    public static void main(String[] args) {
        try {
            int number = readInteger();
            System.out.println("Number entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch: Please enter a valid integer.");
        }
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scanner.nextInt();
    }
}