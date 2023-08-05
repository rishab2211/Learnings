import java.util.Scanner;

public class Palindrome {// checking string palindrome
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            // not a palindrome
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string!");
        String str = sc.next();
        sc.close();
        boolean result = isPalindrome(str);
        if (result == true) {
            System.out.print("the entered string is palindrome !");
        } else {
            System.out.print("The entered string is not a palindrome !");
        }
    }

}
