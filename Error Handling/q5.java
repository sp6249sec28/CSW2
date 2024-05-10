// package Error Handling;

public class q5 {
    public static void main(String[] args) {
        try{
            double result = performCalc();
            System.out.println("Result: " + result);
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception occured: "+e.getMessage());
        }
    }
    public static double performCalc(){
        double value = Math.log(Math.sin(30)) + Math.sqrt(25);
        String str = null;
        return value + str.length();
    }
}
