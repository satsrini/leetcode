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




  
       return s.substring(start,end+1);

    }

   
    public static void main(String[] args)
    {
       System.out.println("Hello Palindrome");
    }

}
