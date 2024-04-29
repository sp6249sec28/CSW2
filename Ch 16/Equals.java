// package Ch 16;

public class Equals {
    public static void main(String[] args) {
        // String str1 = "CSW";
        // String str2 = "csw";
        // if(str1.equals(str2)){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        // String str3 = "abc";
        // String str4 = "abc";
        // if (str3==str4){
        //     System.out.println("Equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }

        String str3 = "abc";
        String str4 = new String("abc");
        if (str3.equals(str4)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
