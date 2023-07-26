import java.util.Scanner;

public class star_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how big star pattern you want to make : ");
        int n = sc.nextInt();
        sc.close();// used to resolve source leak problem in system
        for (int i = 1; i <= n; i++) {// outer loop used for the row
            for (int j = 1; j <= i; j++) {// inner loop for the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
