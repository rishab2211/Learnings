import java.util.Scanner;

public class check_prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check prime : ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.print("it is prime .");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.print("the entered number is prime");
            } else if (isprime == false) {
                System.out.print("the entered number is not prime ");
            }
        }

    }

}
