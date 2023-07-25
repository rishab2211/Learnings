public class BuyandSellstocks {
    public static int profit(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;

    }

    public static void main(String args[]) {
        int stockPrices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print("the maximum profit that can be obtained from buying stocks is : " + profit(stockPrices));
    }
}
