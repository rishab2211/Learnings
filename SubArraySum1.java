public class SubArraySum1 {
    public static void bruteforcesum(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                    System.out.println("currsum is " + currsum);
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.print("maxsum = " + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        bruteforcesum(arr);
    }

}
