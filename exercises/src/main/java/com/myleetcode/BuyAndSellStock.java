package com.myleetcode;

/**
 * <h1>BuyAndSellStock.java</h1>
 * This class implements BuyAndSellStock solution.
 * <p> BuyAndSellStock qn can be found in https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-31
 */
public class BuyAndSellStock
{

   public BuyAndSellStock()
   {

   }

   public int maxProfit(int[] prices)
   {
       if(prices == null || prices.length < 2)
       {
          return 0;
       }

       int max=0;

       int begin = 0;
       int end = prices.length-1;

       for(int i = 0; i < prices.length;i++)
       {
          if(prices[begin] >= prices[i])
          {
             begin = i;
             continue;
          }

          if(prices[i] - prices[begin] > max)
          {
             max = prices[i] - prices[begin];
          }
       }


       return max;
   }

   public static void main(String[] args)
   {
      System.out.println("Hello BuyAndSellStock");

      BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
      int[] prices = {7,1,5,3,6,4};

      System.out.println("Should be 5: " + buyAndSellStock.maxProfit(prices));
   }

}
