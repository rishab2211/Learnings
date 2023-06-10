import java.util.Scanner;

public class butterfly_patt {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            for (int b = 1; b <= 2 * (n - i); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How big butterfly pattern you want to see : ");
        int n = sc.nextInt();
        pattern(n);

    }

}
