package com.myleetcode;

import java.util.Stack;

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

      Stack<Integer> stack = new Stack<>();


      int y = Math.abs(x);


      while(y/10 != 0)
      {
         stack.push(y%10);
         y /= 10;
      }

      stack.push(y%10);

      long resultLong = 0L;

      int size = stack.size();

      for(int i = 0; i < size; i++)
      {
         resultLong += stack.pop()*Math.pow(10,i);
      }

      if(x < 0)
      {
        resultLong = -1*resultLong;
      }

      return (resultLong > Integer.MAX_VALUE || resultLong < Integer.MIN_VALUE) ? 0 : (int)resultLong;
   }

   /*public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be 1447 " + reverseInteger.reverse(7441));
   }*/

   /*public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be -859 " + reverseInteger.reverse(-958));
   }*/


   public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be 0 " + reverseInteger.reverse(1534236469));
   }
}
