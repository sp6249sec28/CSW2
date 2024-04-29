// package Ch 13;

public class q5 {
    public static void main(String[] args) {
        try {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5};

            try {
                System.out.println(arr1[3] / arr2[1]); // This line may throw an ArithmeticException
                System.out.println(arr1[4]); // This line may throw an ArrayIndexOutOfBoundsException
            } 
            catch (ArithmeticException e) {
                System.out.println("An ArithmeticException occurred: " + e.getMessage());
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            }

            try {
                int[] arr3 = {6, 7};
                System.out.println(arr3[3]); // This line may throw an ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}