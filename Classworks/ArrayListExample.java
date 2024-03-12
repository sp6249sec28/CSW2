// import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        int size = 5;
        ArrayList<Integer> list = new ArrayList<Integer> (size);
        for(int i=1; i<=size; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
