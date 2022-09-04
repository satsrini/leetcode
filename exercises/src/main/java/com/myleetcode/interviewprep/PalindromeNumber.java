package com.myleetcode.interviewprep;

import java.util.List;
import java.util.ArrayList;

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


       List<Integer> elements = new ArrayList<>();

       while(x > 0)
       {
          elements.add(x%10);
          x = x/10;
       }


       for(int i = 0; i < elements.size()/2; i++)
       {
          if(elements.get(i) != elements.get(elements.size()-i-1))
          {
             return false;
          }
       }

       return true;
    }

    public static void main(String[] args)
    {
         System.out.println("Hello Palindrome Number");
  
         PalindromeNumber palindromeNumber = new PalindromeNumber();
         int x = 121;

         System.out.println("Should be true: " + palindromeNumber.isPalindrome(x));

    }

    /*public static void main(String[] args)
    {
         System.out.println("Hello Palindrome Number");

         PalindromeNumber palindromeNumber = new PalindromeNumber();
         int x = 1001;

         System.out.println("Should be true: " + palindromeNumber.isPalindrome(x));

    }*/


}
