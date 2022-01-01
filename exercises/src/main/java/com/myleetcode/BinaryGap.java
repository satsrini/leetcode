package com.myleetcode;


public class BinaryGap
{

   public int solution(int N)
   {
       int count = 0;
       int tempCount = 0;

       while(N%2 == 0)
       {
          N = N/2;
       }

       while(N > 0)
       {
          if(N%2 == 0)
          {
             tempCount++;
          }else
          {
             count = Math.max(count, tempCount);
             tempCount = 0;
          }
          N = N/2;
       }

       

       return count;

   }

   public static void main(String[] args)
   {

       int N = 529;
 
       System.out.println(new BinaryGap().solution(N));


       int N2 = 15;

       System.out.println(new BinaryGap().solution(N2));

       int N3 = 9;

       System.out.println(new BinaryGap().solution(N3));

       int N4 = 1041;

       System.out.println(new BinaryGap().solution(N4));


       int N5 = 32;

       System.out.println(new BinaryGap().solution(N5));


   }

}
