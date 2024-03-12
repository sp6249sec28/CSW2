import java.util.LinkedHashSet;
public class LHSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhset1 = new LinkedHashSet();
        lhset1.add("Z");
        lhset1.add("R");
        lhset1.add("O");
        lhset1.add("M");
        lhset1.add("KKK");
        lhset1.add("EFG");
        System.out.println(lhset1);
        
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();
        lhset2.add(23);
        lhset2.add(98);
        lhset2.add(13);
        lhset2.add(0);
        lhset2.add(33);
        lhset2.add(61);
        System.out.println(lhset2);
    }
}
