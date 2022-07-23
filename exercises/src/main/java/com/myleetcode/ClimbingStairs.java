package com.myleetcode;

/**
 * <h1>ClimbingStairs.java</h1>
 * This class implements ClimbingStairs solution using Dynamic Programming.
 * It uses the formula - DP[n] = DP[n-1] + DP[n-2]
 * <p> ClimbingStairs qn can be found in https://leetcode.com/problems/climbing-stairs/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-23
 */

public class ClimbingStairs
{

  public ClimbingStairs()
  {


  }

  public int climbStairs(int n)
  {
     if(n <= 0)
     {
        return 0;
     }

     if(n == 1)
     {
        return 1;
     }

     if(n == 2)
     {
        return 2;
     }

     int[] DP = new int[n+1];
     DP[1] = 1;
     DP[2] = 2;

     // DP[n] = DP[n-1] + DP[n-2]
     for(int i = 3; i <= n; i++)
     {
        DP[i] = DP[i-1] + DP[i-2];
     }

     return DP[n];

  }

  public static void main(String[] args)
  {
     System.out.println("Hello Climbing Stairs");

     int n = 5;

     ClimbingStairs climbingStairs = new ClimbingStairs();

     System.out.println("Should be 8:  " + climbingStairs.climbStairs(5));

  }

}
