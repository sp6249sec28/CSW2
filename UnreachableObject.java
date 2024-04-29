// package Ch 15;

public class UnreachableObject {
    private String myObj;
    
    public static void main(String[] args) {
        testMethod1();
        System.gc();
    }
    public UnreachableObject(String myObj) {
        this.myObj = myObj;
    }
    private static void testMethod1(){
        UnreachableObject obj1 = new UnreachableObject("obj1");
        testMethod2();
    }
    private static void testMethod2(){
        UnreachableObject obj2 = new UnreachableObject("obj2");
        testMethod3();
    }
    private static void testMethod3(){
        UnreachableObject obj3 = new UnreachableObject("obj3");
    }
    
    protected void finalize() throws Throwable {
        System.out.println("Garbage collection is successful for " + this.myObj);
    }
}
