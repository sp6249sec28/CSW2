import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx {
    public static void main(String [] args) throws java.lang.Exception {
        ArrayList myList = new ArrayList();
        myList.add(5);
        myList.add(2);
        myList.add(4);
        for (int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        int indexofTwo = myList.indexOf(2);
        System.out.println(indexofTwo);
        System.out.println(myList.isEmpty());
        myList.remove(0);
        System.out.println(myList);
        myList.set(0, 5);
        myList.set(1, 2);
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
    }

}
