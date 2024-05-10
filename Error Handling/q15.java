// package Error Handling;

public class q15 {
    public static void main(String[] args) {
        String str = "abcd";
        int result = 0;
        try{
            result = Integer.parseInt(str);
            try{
                int quotient = 10/result;
                System.out.println("Result: " + result);
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException: " + e);
            }
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
