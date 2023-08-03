import java.util.*;

public class spiralMatrix {
    public static void printSprial(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int i = startcol; i <= endcol; i++) {
                System.out.print(matrix[startcol][i] + " ");
            }
            // right most
            for (int j = startrow + 1; j <= endrow; j++) {
                System.out.print(matrix[j][endcol] + " ");
            }
            // bottom
            for (int k = endcol - 1; k >= startcol; k--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][k] + " ");
            }
            // left most
            for (int l = endrow - 1; l >= startrow + 1; l--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[l][startcol] + " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row you want to make in 2 D array :");
        int n = sc.nextInt();
        System.out.println("enter the number of columns you want to make in 2 D array :");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.print("enter the elements of 2-D array with " + n + " rows and " + m + " columns");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        printSprial(matrix);

    }

}
