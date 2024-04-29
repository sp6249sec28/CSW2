// package Ch 16;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.next();
        System.out.print("Enter a substring: ");
        String str2 = sc.next();
        String subs = str2;
        int c = str1.split(subs, -1).length - 1;
        System.out.println(str2 + " appears " +c+ " times in the string "+ str1);
    }
}