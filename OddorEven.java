public class OddorEven {
    public static void check(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.print("even");
        } else {
            System.out.print("odd");
        }
    }

    public static void main(String args[]) {
        int num1 = 000101;
        int num2 = 001010;
        check(num1);
        System.out.println();
        check(num2);

    }
}