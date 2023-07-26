import java.util.*;

public class prime_in_range {
    public static boolean prime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void inrange(int n1) {
        for (int i = 2; i <= n1; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }

        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the last limit of the range : ");
        int n1 = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        inrange(n1);

    }

}
