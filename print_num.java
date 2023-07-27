import java.util.Scanner;

public class print_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter till when you want to print the numbers ");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        System.out.println("Here you Go !");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

    }
}