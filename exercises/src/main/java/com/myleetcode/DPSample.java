package com.myleetcode;

/**
 * <h1>DPSample.java</h1>
 * Using Dynamic Programming, this class finds no of different possible ways of finding the sum N using three given 
 * integers 1,3 and 4
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-12
 */
public class DPSample
{

   public DPSample()
   {

   }

   public int solution(int N)
   {

       if(N <= 0)
       {
          return 0;
       }

       int[] DP = new int[N+1];

       DP[0] = 1;
       DP[1] = 1;
       DP[2] = 1;
       DP[3] = 2;

       if(N < 4)
       {
          return DP[N];
       }

       for(int i = 4; i < DP.length; i++)
       {
          DP[i] = DP[i-1] + DP[i-3] + DP[i-4];
       }

       return DP[N];
   }


   /*public static void main(String[] args)
   {
      DPSample dpSample = new DPSample();
      System.out.println("Should be 6:   " + dpSample.solution(5));
   }*/

   /*public static void main(String[] args)
   {
      DPSample dpSample = new DPSample();
      System.out.println("Should be 4:   " + dpSample.solution(4));
   }*/

   public static void main(String[] args)
   {
      DPSample dpSample = new DPSample();
    
      System.out.println("Should be what ? :   " + dpSample.solution(100));

   }
}
