// package Ch 13;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        System.out.print("Enter arithmetic operation to be performed(+,-,*,/): ");
        char operator = sc.next().charAt(0);
        try{
            double result = 0;
            switch (operator){
                case '+' :
                    result = n1+n2;
                    break;
                case '-' :
                    result = n1-n2;
                    break;
                case '*' :
                    result = n1*n2;
                    break;
                case '/' :
                    if(n2 == 0){
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    else{
                        result = n1/n2;
                        break;
                    }
                }
                System.out.println("Result: " + result);
            
            }
            catch(ArithmeticException e){
                    System.out.println(e.getMessage());
            }
    }  
}
