public class FastExponentiation {
    public static int fastexpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {// checking LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        int a = 5;
        int n = 10;
        System.out.print(a + " to the power " + n + " is " + fastexpo(a, n));

    }

}
