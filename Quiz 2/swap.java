// package Quiz 2;
public class swap {
    public static <T> void swap(T[] array, int i, int j) {
        if (i == j) {
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static <T> void printArr(T[] array){
        for ( T element : array){
            System.out.print(element + " ");
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        System.out.println("Array after swapping: ");
        swap(intArray, 1,3);
        printArr(intArray);
    }
}
