import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> haset = new HashSet();
        haset.add("Apple");
        haset.add("Mango");
        haset.add("Grapes");
        haset.add("Orange");
        haset.add("Berry");

        //Adding duplicate elements
        haset.add("Mango");
        haset.add("Orange");

        haset.add("null");
        haset.add(null);

        System.out.println(haset);
        // System.out.println(haset.size());
        for(String i:haset){
            System.out.println(i);
        }
        System.out.println(haset.size());
        System.out.println(haset.contains("Apple"));

    } 
}
