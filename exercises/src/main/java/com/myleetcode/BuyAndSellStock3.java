package com.myleetcode;

/**
 * <h1>BuyAndSellStock3.java</h1>
 * This class implements BuyAndSellStock3 solution.
 * <p> BuyAndSellStock3 qn can be found in https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-01
 */

public class BuyAndSellStock3
{
   public BuyAndSellStock3()
   {

   }

   public int maxProfit(int[] prices)
   {
      if(prices == null || prices.length <= 1)
      {
          return 0;
      }

      int profit1 = 0;
      int profit2 = 0;
      int begin = 0;

      for(int i = 1; i < prices.length-1; i++)
      {
         if(prices[begin] > prices[i])
         {
            // TBD: find interim profit
            int interimProfit = prices[i-1]-prices[begin];
            begin = i;
            continue;
         }

         
      }

      return profit1+profit2;
   }

   public static void main(String[] args)
   {
      System.out.println("Hello BuyAndSellStock3");
   }
}
