// package Ch 17;
import java.util.Scanner;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 3, n = 3;
        int a[][] = new int[m][n];
        System.out.print("Matrix A: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<=n; j++) {
                System.out.print(a[i][j]+" ");
            System.out.println();
            }
        }
    }
    public static void direction(int a[][]){
        
    }
}
