//InteractiveStringExplorer
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        while (true) {
            System.out.println("1. To lowercase\n2. To uppercase\n3. Search character\n4. Concatenate\n5. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.println(str.toLowerCase());
                    break;
                case 2:
                    System.out.println(str.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter character to search for: ");
                    char c = scanner.nextLine().charAt(0);
                    System.out.println("First occurrence: " + (str.indexOf(c)+1) +"th position");
                    break;
                case 4:
                    System.out.print("Enter string to concatenate: ");
                    String toConcat = scanner.nextLine();
                    str += toConcat;
                    System.out.println("New string: " + str);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}