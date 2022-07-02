package com.myleetcode;


/**
 * <h1>LongestPalindrome</h1>
 * This class finds the longest palindrome substring to be found in a given string
 * <p> LongestPalindrome qn can be found in https://leetcode.com/problems/longest-palindromic-substring/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-02
 */


public class LongestPalindrome
{
  
    public LongestPalindrome()
    {

    }

    public String longestPalindrome(String s)
    {
        if(s == null | s.length() == 0)
        {
           return "";
        }

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++)
        {
           int length1 = getMaxPalindromeLength(s,i,i);
           int length2 = getMaxPalindromeLength(s,i,i+1);

           int length = Math.max(length1,length2);


           if(length > (end-start+1))
           {
              if(length % 2 == 1)
              {
                 start = i - length/2;
              }else
              {
                 start = i - length/2 + 1;
              }
 
              end = i + length/2;
              
           }

        }
  
       return s.substring(start,end+1);

    }

    private int getMaxPalindromeLength(String s, int a, int b)
    {

        if(b < s.length() && s.charAt(a) != s.charAt(b))
        {
           return 1;
        }

        int l = a;
        int r = b;

        int length = 0;

        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
           length = r-l+1;
           l--;
           r++;
        }       

        return length;

    }

   
    /*public static void main(String[] args)
    {
       System.out.println("Hello Palindrome");

       String s = "babad";
       
       LongestPalindrome longestPalindrome = new LongestPalindrome();

       System.out.println("Should be bab " + longestPalindrome.longestPalindrome(s));

    }*/

    public static void main(String[] args)
    {
       System.out.println("Hello Palindrome");

       String s = "cbbd";

       LongestPalindrome longestPalindrome = new LongestPalindrome();

       System.out.println("Should be bb " + longestPalindrome.longestPalindrome(s));

    }


}
