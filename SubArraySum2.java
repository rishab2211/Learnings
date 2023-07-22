public class SubArraySum2 {
    public static void prefixarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int k = 1; k < prefix.length; k++) {
            prefix[k] = prefix[k - 1] + arr[k];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = i == 0 ? prefix[0] : prefix[j] - prefix[i - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }

        }
        System.out.print("maxsum " + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { 45, 2, 3, 4, 5, 6, 7, 8, 9 };
        prefixarray(arr);

    }

}
