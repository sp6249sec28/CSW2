// package Error Handling;

import java.util.Scanner;
public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x in angles: ");
        double x = sc.nextDouble();
        try{
            double rad = Math.toRadians(x);
            double result = calcExpression(rad);
            System.out.println("Result : " + result);
        }catch(ArithmeticException e){
            System.out.println("Error occured: " +e.getMessage());
        }
    }
    public static double calcExpression(double rad){
        double result = 0;
        double sinx = Math.sin(rad);
        double cosx = Math.cos(rad);
        double tanx = Math.tan(rad);
        if(tanx-(1/tanx) == 0){
            System.out.println("Error: Can't divide by zero");
            return Double.NaN;
        }
        result = Math.log(Math.abs(sinx+cosx))/(tanx-(1/tanx));
        return result;
    }
}