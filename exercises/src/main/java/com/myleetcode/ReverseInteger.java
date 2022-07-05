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

      int result = 0;

      int pop = 0;

      while(x != 0)
      {
         
         pop = x%10;
         x /= 10;

         if(result > Integer.MAX_VALUE/10 || 
                  (result == Integer.MAX_VALUE/10 && pop > 7) ||
                             result < Integer.MIN_VALUE/10 ||  
                                    (result == Integer.MIN_VALUE/10 && pop < -8) ) // overflow condition
         {
             return 0;
         }

         result = result*10 + pop;

      }

      return result;
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


   /*public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be 0 " + reverseInteger.reverse(1534236469));
   }*/

   /*public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be 0 " + reverseInteger.reverse(2147483647));
   }*/

   public static void main(String[] args)
   {
      System.out.println("Hello Reverse Integer");

      ReverseInteger reverseInteger = new ReverseInteger();

      System.out.println("Should be 0 " + reverseInteger.reverse(-2147483648));
   }


}
