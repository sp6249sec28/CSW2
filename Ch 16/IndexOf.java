// package Ch 16;

public class IndexOf {
    public static void main(String[] args) {
        String str = "hello world, world";
        int i = str.indexOf(","); //works in both "" and ''
        System.out.println(i);

        int j = str.lastIndexOf("worl");
        int k = str.lastIndexOf('o');
        System.out.println(j + ", " + k);
    }
}
