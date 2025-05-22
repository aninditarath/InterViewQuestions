package org.practice.Arrays;

public class BesttimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

         int j=0;
         int i=1;

         int maxprofit=0;

         while (i<=prices.length-1 && j<=prices.length-1){

            if(prices[i]<prices[j]){
                j++;
            }
            else{

               int profit=prices[i]-prices[j];

               maxprofit= Math.max(profit,maxprofit);
                i++;
            }



        }
     return maxprofit;
    }
}
