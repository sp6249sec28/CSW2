// package Error Handling;

import java.util.Scanner;
public class q11 {
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
        double epsilon = 1e-6;
        if(Math.abs(rad % (Math.PI/2)) < epsilon){
            throw new ArithmeticException();
        }
        double sinx = Math.sin(rad);
        double cosx = Math.cos(rad);
        double tanx = Math.tan(rad);
        return (Math.log(sinx + cosx))/(tanx - (1/tanx));
    }
}