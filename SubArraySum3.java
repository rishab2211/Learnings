public class SubArraySum3 {
    public static void KadanesAlgo(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.print("maxsum" + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        KadanesAlgo(arr);

    }

}
