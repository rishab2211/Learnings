import java.util.Scanner;

public class sum_till_n {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till where you want to calculate sum");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("the sum is :" + sum);

    }

}
