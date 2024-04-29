// package Ch 13;
//Write a program that prompts the user to enter an integer. 
// Wrap the conversion from String to integer in a try-catch
//  block to handle a potential NumberFormatException if the
//   user enters a non-numeric value. In the catch block, 
//   print an appropriate error 
// message and ask the user to enter a valid integer.
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String a = sc.next();
        try {
            int b = Integer.parseInt(a); 
            System.out.println("You entered " + b);
        }
        catch (NumberFormatException e){
            System.out.println("Enter a valid input");
        }
    }
}
