import java.util.Scanner;

public class binomial_coeff {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int bincoff(int n, int r) {
        int factn = fact(n);
        int factnmr = fact(n - r);
        int factr = fact(r);
        int bin = factn / (factnmr * factr);
        return bin;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of n : ");
        int n = sc.nextInt();
        System.out.print("enter the value of r : ");
        int r = sc.nextInt();
        int result = bincoff(n, r);
        System.out.println("the calcuted value of binomial coefficient of n and r as " + n + "," + r + " is " + result);

    }
}