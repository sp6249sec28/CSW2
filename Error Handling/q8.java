// package Error Handling;
import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an integer number: ");
        try{
            int num = sc.nextInt();
            double sqRoot = calcSqRoot(num);
            System.out.println("Square Root of "+num + " is " + sqRoot);
        }
        catch(ArithmeticException e){
            System.out.println("Error: Cannot find sq. root of negative numbers.");
        }
        catch(Exception e){
            System.out.println("Error: Invalid Input");
        }
    }
    public static double calcSqRoot(double num) throws ArithmeticException{
        if(num<0){
            throw new ArithmeticException();
        }
        return Math.sqrt(num);
    }
}
