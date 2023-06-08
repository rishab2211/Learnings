import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the factorial to be calculated :");
        int n = sc.nextInt();// taking input from user
        int fact = 1;// initializing the factorial value as 1
        for (int i = 1; i <= n; i++) {
            fact = fact * i;// calculating and updating value of fact in each loop
        }
        System.out.print("the factorial of " + n + " is " + fact);
    }
}