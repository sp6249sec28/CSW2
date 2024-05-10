// package Error Handling;

import java.util.Scanner;
public class q13 {
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
        double result = 0.0;
        double sinx = Math.sin(rad);
        double cosx = Math.cos(rad);
        double tanx = Math.tan(rad);
        if((sinx+cosx) == 0){
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        result = (sinx*cosx)/(sinx+cosx);
        return result;
    }
}