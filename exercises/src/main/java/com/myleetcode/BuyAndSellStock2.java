package com.myleetcode;


/**
 * <h1>BuyAndSellStock2.java</h1>
 * This class implements BuyAndSellStock2 solution.
 * <p> BuyAndSellStock2 qn can be found in https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-31
 */
public class BuyAndSellStock2
{

   public BuyAndSellStock2()
   {

   }

   public int maxProfit(int[] prices)
   {
      if(prices == null || prices.length <= 1)
      {
         return 0;
      }

      int max = 0;

      for(int i = 0; i < prices.length-1; i++)
      {
          if(prices[i] < prices[i+1])
          {
             max += prices[i+1] - prices[i];
          }
      }

      return max; 
   }

   public static void main(String[] args)
   {
      System.out.println("Hello BuyAndSellStock2");

      BuyAndSellStock2 buyAndSellStock2 = new BuyAndSellStock2();

      int[] prices = {7,1,5,3,6,4};

      System.out.println("Should be 7: " + buyAndSellStock2.maxProfit(prices));

   }
}
