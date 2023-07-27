import java.util.Scanner;

public class floyds_triangle {
    public static void pattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how big floyd's triangle you want to create : ");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        pattern(n);

    }

}
