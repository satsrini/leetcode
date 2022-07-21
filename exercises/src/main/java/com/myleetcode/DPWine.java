package com.myleetcode;

/**
 * <h1>DPWine.java</h1>
 * This class is an improvement over 
 * https://github.com/satsrini/leetcode/blob/main/exercises/src/main/java/com/myleetcode/RecursionWine.java from
 * O(pow(2,N)) to O(pow(N,2)) using caching
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-13
 */
public class DPWine
{

   private int[][] cache;

   public DPWine()
   {

   }

   public int solution(int[] p)
   {
      if(p == null || p.length == 0)
      {
         return 0;
      }

      if(p.length == 1)
      {
         return p[0];
      }

      cache = new int[p.length][p.length];

      return profit(p, 0, p.length-1, 1);
   }

   private int profit(int[] p, int start, int end, int year)
   {

     if(start > end)
     {
        return 0;
     }

     if(cache[start][end] == 0)
     {
        cache[start][end] =  Math.max(profit(p,start+1,end,year+1) + year*p[start], profit(p,start,end-1,year+1) + year*p[end]);
     }

     return cache[start][end];
   }

   public static void main(String[] args)
   {

     DPWine dpWine = new DPWine();

     int p[] = {2,3,5,1,4};

     System.out.println("Should be 50:   " + dpWine.solution(p));
   }

}
