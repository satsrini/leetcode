package com.myleetcode.interviewprep;

/**
 * <h1>ValidPalindrome.java</h1>
 * This class implements ValidPalindrome solution.
 * <p> ValidPalindrome qn can be found in https://leetcode.com/problems/valid-palindrome/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-30
 */

public class ValidPalindrome
{


    public ValidPalindrome(){}

    public boolean isPalindrome(String s)
    {

       s = s.trim().toLowerCase();

       int i = 0;
       int j = s.length()-1;
       char a,b;
   
       while(i < j)
       {
          a = s.charAt(i);
          b = s.charAt(j);
          if(!Character.isLetterOrDigit(a))
          {
             i++;
             continue;
          }

          if(!Character.isLetterOrDigit(b))
          {
             j--;
             continue;
          }

          if(a != b)
          {
            return false;
          }

          i++;
          j--;

       }

       return true;
    }

    /*public static void main(String[] args)
    {
       System.out.println("Hello ValidPalindrome");

       ValidPalindrome validPalindrome = new ValidPalindrome();
       String s = "A man, a plan, a canal: Panama";


       System.out.println("Should be true:  " + validPalindrome.isPalindrome(s));

    }*/

    public static void main(String[] args)
    {
       System.out.println("Hello ValidPalindrome");

       ValidPalindrome validPalindrome = new ValidPalindrome();
       String s = "race a car";

       System.out.println("Should be false:  " + validPalindrome.isPalindrome(s));

    }


}
