import java.util.*;

public class bin_to_dec {
    public static void bintodec(int n) {
        int pow = 0;
        int dec = 0;
        while (n > 0) {
            int ld = n % 10;
            dec = dec + ld * (int) Math.pow(2, pow);
            pow++;
            n = n / 10;

        }
        System.out.print(dec);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of binary to be converted : ");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        bintodec(n);
    }

}
