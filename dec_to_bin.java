import java.util.Scanner;

public class dec_to_bin {
    public static void dectobin(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + rem * (int) Math.pow(10, pow);
            pow++;
            n = n / 2;

        }
        System.out.print(bin);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the decimal value to be converted in binary : ");
        int n = sc.nextInt();
        dectobin(n);
    }

}
