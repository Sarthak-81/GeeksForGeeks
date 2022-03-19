//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// public class Stocks {
//     public static int maxProfit(int[] prices) {
//         int maxProfit = 0;
//         int minSoFar = prices[0];
//         for (int i = 0; i < prices.length; i++) {
//             minSoFar = Math.min(minSoFar, prices[i]);
//             int profit = prices[i] - minSoFar;
//             maxProfit = Math.max(maxProfit, profit);
//         }
//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int[] array = { 5, 2, 6, 1, 4 };
//         int value = maxProfit(array);
//         System.out.println(value);
//     }
// }

// You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

// On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

// Find and return the maximum profit you can achieve.

public class Stocks{

    static int maxProfit(int[] array){
        int profit=0;
        for(int i=1; i<array.length; i++){
            if(array[i]>array[i-1]){
                profit+=(array[i] - array[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] array = {5,2,6,1,4,7,3,6};
        int value = maxProfit(array);
        System.out.println(value);
    }
}
