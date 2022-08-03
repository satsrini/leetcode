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

   private int profit1 = 0;
   private int profit2 = 0;

   public BuyAndSellStock3()
   {

   }

   public int maxProfit(int[] prices)
   {
      if(prices == null || prices.length <= 1)
      {
          return 0;
      }

      int begin = 0;
      for(int i = 1; i < prices.length; i++)
      {
         if(prices[begin] > prices[i])
         {
            fixProfit(prices[i-1]-prices[begin]);
            begin = i;
            continue;
         }

         if(i == prices.length-1)
         {
            fixProfit(prices[i]-prices[begin]);
            break;
         }
         
      }

      return profit1+profit2;
   }

   private void fixProfit(int interimProfit)
   {
      if(interimProfit > profit1 || interimProfit > profit2)
      {
         if(profit1 > profit2)
         {
            profit2 = interimProfit;
         }else
         {
            profit1 = interimProfit;
         }
      }

   }

   public static void main(String[] args)
   {
      System.out.println("Hello BuyAndSellStock3");

      BuyAndSellStock3 buyAndSellStock3 = new BuyAndSellStock3();
      int[] prices = {3,3,5,0,0,3,1,4};

      System.out.println("Should be 6: " + buyAndSellStock3.maxProfit(prices));      

   }
}
