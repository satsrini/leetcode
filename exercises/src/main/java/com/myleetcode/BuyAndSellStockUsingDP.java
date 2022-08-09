package com.myleetcode;

/**
 * <h1>BuyAndSellStock.java</h1>
 * This class implements BuyAndSellStock solution using DP
 * <p> BuyAndSellStock qn can be found in https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-09
 */

public class BuyAndSellStockUsingDP
{

   public BuyAndSellStockUsingDP()
   {

   }

   public int maxProfit(int[] prices)
   {
      int[][] DP = new int[1][2];

      DP[0][1] = prices[0];

      for(int i = 1; i < prices.length; i++)
      {
         DP[0][0] = Math.max(DP[0][0], prices[i]-DP[0][1]);
         DP[0][1] = Math.min(prices[i], DP[0][1]);
      }

      return DP[0][0];
   }

   public static void main(String[] args)
   {
      System.out.println("Hello BuyAndSellStockUsingDP");

      int[] prices = {7,1,5,3,6,4};

      BuyAndSellStockUsingDP buyAndSellStockUsingDP = new BuyAndSellStockUsingDP();
      System.out.println("Should be 5: " + buyAndSellStockUsingDP.maxProfit(prices));
   }

}
