package com.myleetcode;

/**
 * <h1>BuyAndSellStock2UsingDP.java</h1>
 * This class implements BuyAndSellStock2UsingDP solution.
 * <p> BuyAndSellStock2UsingDP qn can be found in https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-31
 */
public class BuyAndSellStock2UsingDP
{

  public BuyAndSellStock2UsingDP(){}

  public int maxProfit(int[] prices)
  {

     int[][] DP = new int[1][2];
     
     DP[0][1] = prices[0];

     for(int i = 1; i < prices.length; i++)
     {
        DP[0][0] += Math.max(0, prices[i]-DP[0][1]);
        DP[0][1] = prices[i];
     }

     return DP[0][0];
  }

  public static void main(String[] args)
  {
     System.out.println("Hello BuyAndSellStock2UsingDP");

     int[] prices = {7,1,5,3,6,4};

     BuyAndSellStock2UsingDP buyAndSellStock2UsingDP = new BuyAndSellStock2UsingDP();
     System.out.println("Should be 7: " + buyAndSellStock2UsingDP.maxProfit(prices));
  }

}
