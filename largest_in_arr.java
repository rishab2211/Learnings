public class largest_in_arr {
    public static void code(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        System.out.print("the largest value in the given array is : " + largest);
    }

    public static void main(String args[]) {
        int arr[] = { 12, 92, 63, 49, 50, 62, 73, 86, 9, 99 };
        code(arr);

    }

}
