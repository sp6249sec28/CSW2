import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q16toq22 {

    public static void main(String[] args) {
        // Handling ArrayIndexOutOfBoundsException in a dynamic data structure
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        try {
            int value = list.get(10); // Trying to access element beyond the bounds
            System.out.println("Value: " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds in the list");
        }

        // Handling ArrayIndexOutOfBoundsException in recursive algorithm
        int[] array = {1, 2, 3, 4, 5};
        try {
            recursiveAlgorithm(array, 0); // Recursive function call
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Recursive function reached beyond the bounds of the array");
        }

        // Handling ArrayIndexOutOfBoundsException in complex array manipulations
        try {
            int[] arr = {1, 2, 3, 4, 5};
            // Trying to access an element beyond the bounds of the array
            int element = arr[10];
            System.out.println("Element: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds in array manipulation");
        }

        // Handling ArrayIndexOutOfBoundsException in matrix operations
        try {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            // Trying to access an element beyond the bounds of the matrix
            int value = matrix[2][3];
            System.out.println("Value: " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds in matrix operations");
        }
    }

    // Recursive algorithm
    public static void recursiveAlgorithm(int[] array, int index) {
        if (index >= array.length) {
            return; // Terminate recursion if index exceeds array bounds
        }
        System.out.println(array[index]);
        recursiveAlgorithm(array, index + 1); // Recursive call
    }
}