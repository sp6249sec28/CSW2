// package Ch 15;

public class ReassigningReference {
    private String myObj;
    public ReassigningReference(String myObj){
        this.myObj = myObj;
    } 
    public static void main(String[] args) {
        ReassigningReference r1 = new ReassigningReference("r1"); 
        ReassigningReference r2 = new ReassigningReference("r2"); 

        r1 = r2;

        System.gc();
    }
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is successful for "+ this.myObj);
    }
}
