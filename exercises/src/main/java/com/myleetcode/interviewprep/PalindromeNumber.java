package com.myleetcode.interviewprep;

/**
 * <h1>PalindromeNumber.java</h1>
 * This class implements PalindromeNumber solution.
 * <p> PalindromeNumber qn can be found in https://leetcode.com/problems/palindrome-number/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-09-04
 */

public class PalindromeNumber
{

    public PalindromeNumber(){}

    public boolean isPalindrome(int x)
    {

       if(x < 0)
       {
          return false;
       }

       if(x < 10)
       {
          return true;
       }

       int length = length(x);

       int a = (int)Math.pow((double)10,(double)(length-1));
       int b = 10;

       for(int i = 0; i < length/2; i++)
       {
          if(x/a != x%b)
          {
             return false;
          }

          a = a/10;
          b = b*10;
       }

       return true;
    }

    private int length(int x)
    {
       int length = 0;

       while(x > 0)
       {
          x = x/10;
          length++;
       }

       return length;
    }


    public static void main(String[] args)
    {
         System.out.println("Hello Palindrome Number");
  
         PalindromeNumber palindromeNumber = new PalindromeNumber();
         int x = 121;

         System.out.println("Should be true: " + palindromeNumber.isPalindrome(x));

    }

}
