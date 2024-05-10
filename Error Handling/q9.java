// package Error Handling;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        try{
            double result = divideNum(num1, num2);
            System.out.println("Result is "+ result);
        }
        catch(ArithmeticException e){
            System.out.println(e + " : Cannot divide by zero.");
        }
    }
    public static double divideNum(double num1, double num2){
        if(num2 == 0){
            throw new ArithmeticException();
        }
        return (double)num1/num2;
    }
}
