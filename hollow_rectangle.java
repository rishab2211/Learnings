import java.util.*;

public class hollow_rectangle {
    public static void pattern(int totrows, int totcol) {
        for (int i = 1; i <= totrows; i++) {
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || i == totrows || j == 1 || j == totcol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int m = sc.nextInt();
        System.out.print("enter the number of coloumns : ");
        int n = sc.nextInt();
        pattern(m, n);

    }

}
