// package Quiz 2;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> emplist = new HashMap<Integer, String>();
        emplist.put(1, "Shivam");
        emplist.put(2, "Pranab");
        emplist.put(3, "Somnath");
        emplist.put(4, "Sai");
        int [] employeeIds = {1, 2};
        
        System.out.println("Employee names: ");
        for (int i : employeeIds){
            String name = emplist.get(i);
            if(name != null){
                System.out.println("Employee ID " + i + ": " + name);
            }
            else{
                System.out.println("Employee with ID "+i + " not found");
            }
        }
    }
}
