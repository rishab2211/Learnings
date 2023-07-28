import java.util.*;

public class _2D_Array_basics {
    public static void basics(int n, int m) {// n=number of rows & m= number of columns
        // CREATION & TAKING INPUT OF MATRIX-2D ARRAY
        int matrix[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the keys of 2-D array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // OUTPUT
        System.out.println("The 2-D Array is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // FINDING ANY KEY IN ARRAY
        System.out.println("enter the key to be find in the array : ");
        int key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("the key is found at : " + i + "," + j);
                }
            }
        }
        sc.close();

    }

    public static void main(String args[]) {
        basics(3, 3);

    }

}
