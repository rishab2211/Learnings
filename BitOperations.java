import java.util.Set;

public class BitOperations {
    public static int GetithBit(int n, int i) {// to get the ith bit from the binary number which is converted from
                                               // entered decimal number in computer system
        int bitmask = 1 << i;// left shifting 1 to ith times to get ith element
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int SetithBit(int n, int i) {// ADDING 1 IN ith PLACE
        int bitmask = 1 << i;
        return (n | bitmask);

    }

    public static int ClearithBit(int n, int i) {// clearing bit from ith position
        int notbitmask = ~(1 << i);
        return n & notbitmask;
    }

    public static int Updateithbit_1(int n, int i, int newBit) {// algo with previously written clearing and setting
                                                                // function
        if (newBit == 0) {
            return ClearithBit(n, i);
        } else {
            return SetithBit(n, i);
        }
    }

    public static int Updateithbit_2(int n, int i, int newBit) {// updating ith bit with newBit
        n = ClearithBit(n, i);
        int bitmask = newBit << i;
        return n & bitmask;

    }

    public static int ClearLastiBits(int n, int i) {// clearing last i bits
        int notbitmask = ~0 << i;
        return n & notbitmask;
    }

    public static int ClearRangeofBits(int n, int i, int j) {// clearing a range of bits
        int a = ~0 << j + 1;
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String args[]) {
        int n1 = 5;// decimal number
        int i1 = 2;// ith position
        System.out.print("the ith bit of the number is : " + GetithBit(n1, i1));
        System.out.println();
        int n2 = 9;// decimal number for Set ith bit function
        int i2 = 2;
        System.out.print("number after setting ith bit : " + SetithBit(n2, i2));
        System.out.println();
        int n3 = 9;// decimal input for clear ith bit function
        int i3 = 3;
        System.out.print("the number after clearing ith bit : " + ClearithBit(n3, i3));
        System.out.println();
        int n4 = 7;
        int i4 = 2;
        int newbit = 0;
        System.out.print("the number after updating ith bit with newbit : " + Updateithbit_1(n4, i4, newbit));
        System.out.println();
        System.out.print("the number after clearing last i bits : " + ClearLastiBits(15, 2));
        System.out.println();
        System.out.print("the number after clearing a range of bits : " + ClearRangeofBits(2515, 2, 7));
    }

}
