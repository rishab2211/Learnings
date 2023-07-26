import java.util.Scanner;

public class half_pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How big pyramid you want to make ?");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
