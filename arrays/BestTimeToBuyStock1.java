package arrays;

public class BestTimeToBuyStock1 {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            maxProfit = Math.max(prices[i] - min, maxProfit);
            min = Math.min(prices[i], min);
        }
        return maxProfit;
    }
}
