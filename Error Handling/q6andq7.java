// package Error Handling;
import java.util.Scanner;
public class q6andq7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = sc.next();
        try{
            int value = tryInt(input);
            System.out.println("Integer value: " + value);
        }catch(NumberFormatException e){
            System.out.println("Error: Invalid Input ");
        }
    }
    public static int tryInt(String input) throws NumberFormatException{
        return Integer.parseInt(input);
    }
}
