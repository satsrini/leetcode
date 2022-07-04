package com.myleetcode;

/**
 * <h1>ReverseInteger.java</h1>
 * This class reverses the given Integer
 * <p> Reverse Integer qn can be found in https://leetcode.com/problems/reverse-integer/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-04
 */

public class ReverseInteger
{
 
   public ReverseInteger()
   {

   }

   public int reverse(int x)
   {
      if(x == 0)
      {
         return 0;
      }

      StringBuilder resultStrBuilder = new StringBuilder();


      int y = x;

      if(x < 0)
      {
        y = -1*y;
      }

      while(y/10 != 0)
      {
         resultStrBuilder.append(y%10);
         y /= 10;
      }

      resultStrBuilder.append(y%10);

      int result = Integer.parseInt(resultStrBuilder.toString());

      if(x < 0)
      {
        result = -1*result;
      }

      return result;
   }

   /*public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be 1447 " + reverseInteger.reverse(7441));
   }*/

   public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be -859 " + reverseInteger.reverse(-958));
   }



}
