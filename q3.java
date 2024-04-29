// package Ch 13;
// Write a program that simulates a login system. 
// The program prompts the user for a username and password.  
// Wrap the code that checks the credentials in a try-catch block. 
// In the catch block, handle any IndexOutOfBoundsException that 
// might occur if the username or password entered is too short.
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        try{
            if(password.length() > 8){
                System.out.println();
            }
            else{
                System.out.println("Username: "+username+
                "\nPassword: "+password);
            }
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e + " Invalid input!");
        }
    }
}
