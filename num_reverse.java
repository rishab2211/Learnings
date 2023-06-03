import java.util.Scanner;

public class num_reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to be reversed : ");
        int n = sc.nextInt();
        int rev = 0;
        int ld;
        while (n > 0) {
            ld = n % 10;// storing last digit
            rev = rev * 10 + ld;// making number with lastdigit
            n = n / 10;// updating and removing the number to be reversed
        }
        System.out.println("the reversed number is : " + rev);
    }

}
