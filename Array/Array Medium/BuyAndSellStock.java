public class BuyAndSellStock {

  public static int maxProfit(int[] prices) {
    int maxpro = 0;
    int minprice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < minprice) {
        minprice = prices[i];
      } else if (prices[i] - minprice > maxpro) {
        maxpro = prices[i] - minprice;
      }
    }

    return maxpro;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };

    System.out.println("Maximum Profit: " + maxProfit(prices));
  }
}
