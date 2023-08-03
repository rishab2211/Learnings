import java.util.*;

public class diagonalSum {
    public static int sumOfDiagonal_1(int matrix[][]) {// Time complexity = O(n^2)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];

                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int sumOfDiagonal_2(int matrix[][]) {// Time complexity = O(n)
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // sum of primary diagonal elements
            sum += matrix[i][i];
            // sum of secondary diagonal
            if (i != matrix.length - 1 - i) {// codition of secondary digonal matrix is i is not equal to j
                sum += matrix[i][matrix.length - i - 1];// secondary diagonl condition in terms of j
            }
        }
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("enter the number of columns : ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("enter the elements of the 2D array : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int sum1 = sumOfDiagonal_1(matrix);
        System.out.print(
                "the diagonal sum calculated with the help of brute force method having Time complexity of O(n^2) is : "
                        + sum1);
        System.out.println();
        int sum2 = sumOfDiagonal_2(matrix);
        System.out
                .print("the diagonal sum calculated with the help of optimized code having Time complexity of O(n) is : "
                        + sum2);

    }

}
