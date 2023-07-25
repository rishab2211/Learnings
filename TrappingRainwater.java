public class TrappingRainwater {
    public static int trappedwater(int height[]) {
        int n = height.length;
        // MaximumLeftBoundary - ARRAY
        int MaxLeftBound[] = new int[n];
        MaxLeftBound[0] = height[0];
        for (int i = 1; i < n; i++) {
            MaxLeftBound[i] = Math.max(MaxLeftBound[i - 1], height[i]);
        }
        // MaximumRightBoundary - ARRAY
        int MaxRightBound[] = new int[n];
        MaxRightBound[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            MaxRightBound[j] = Math.max(MaxRightBound[j + 1], height[j]);
        }

        // Loop
        // TrappedWater and WaterLevel
        int trappedwater = 0;
        // TrappedWater = WaterLevel - Height
        int waterlevel[] = new int[n];
        for (int k = 0; k < n; k++) {
            waterlevel[k] = Math.min(MaxRightBound[k], MaxLeftBound[k]);// the smalller boundary = waterlevel
            trappedwater = trappedwater + waterlevel[k] - height[k];
        }
        return trappedwater;

    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int result = trappedwater(height);
        System.out.print("the trapped water between the heights is : " + result);
    }

}
