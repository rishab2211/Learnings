public class reverse_Arr {
    public static void reverse(int num[]) {
        int start = 0;
        int last = num.length - 1;
        while (start < last) {
            int temp = num[start];
            num[start] = num[last];
            num[last] = temp;
            start++;
            last--;

        }
        System.out.print("the reversed array is : ");
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.print(num[i] + " ");
        }

    }

    public static void main(String args[]) {
        int num[] = { 2, 3, 4, 5, 6, 5, 88, 66, 43, 22 };
        reverse(num);

    }

}