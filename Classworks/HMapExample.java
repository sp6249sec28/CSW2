import java.util.HashMap;
import java.util.*;
public class HMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap1 = new HashMap();
        hmap1.put(14, "Pranab");
        hmap1.put(33, "Sai");
        hmap1.put(16, "Debadarshi");
        hmap1.put(7, "Somnath");
        hmap1.put(19, "Shivam");
        Set set1 = hmap1.entrySet();
        Iterator iterator1 = set1.iterator();
        // while (iterator1.hasNext()) {
        //     Map.Entry ment1 = (Map.Entry) iterator1.next();
        //     System.out.println("The value is: "+ ment1.getValue() + " and key is: " + ment1.getKey());
        // }
        for (int i:hmap1.keySet()){
            System.out.println(hmap1.get(i));
        }
        String va = hmap1.get(2);
        System.out.println("Index 2 has value of " + va);
        hmap1.remove(16);
        Set set2 = hmap1.entrySet();
        Iterator iterator2 = set2.iterator();
    }
}
