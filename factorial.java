import java.util.Scanner;

public class factorial {
    public static void fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        System.out.print(factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int n = sc.nextInt();
        System.out.print("The factorial of the entered number is : ");
        fact(n);

    }

}
