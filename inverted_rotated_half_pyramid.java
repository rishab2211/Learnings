import java.util.*;

public class inverted_rotated_half_pyramid {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how big inverted half pyramid pattern you want to see ?");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        pattern(n);
    }

}
