import java.util.ArrayList;
import java.util.List;

public class q27 {

    public static void main(String[] args) {
        try {
            List<String> stringList = new ArrayList<>();
            stringList.add("Hello");
            // Trying to cast a String to an Integer
            Integer number = (Integer) stringList.get(0);
            System.out.println("Number: " + number);
        } catch (ClassCastException e) {
            System.out.println("Class cast exception: " + e.getMessage());
        }
    }
}