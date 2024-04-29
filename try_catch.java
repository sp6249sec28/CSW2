// package Ch 13;

public class try_catch {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 0;
        try{
            int v3 = v1/v2; // This is the statement that will cause the exception to be thrown
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Not possible to divide by zero.");
            System.out.println(e.getMessage());
        }
    }
    
}
//Questions - github.com/namastevis/csw2