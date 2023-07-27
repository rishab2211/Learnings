import java.util.Scanner;

public class character_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How big character pattern you want to make ? ");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
