public class stock {
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
    public static int buyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int bp = prices[0];
        for(int i=1; i<prices.length; i++) {
            int profit = prices[i] - bp;
            bp = Math.min(bp, prices[i]);
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
