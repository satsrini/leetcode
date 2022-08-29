package com.myleetcode.interviewprep;

/**
 * <h1>LongestCommonPrefix.java</h1>
 * This class implements LongestCommonPrefix solution.
 * <p> LongestCommonPrefix qn can be found in https://leetcode.com/problems/longest-common-prefix/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-29
 */


public class LongestCommonPrefix
{

   public LongestCommonPrefix(){}

   public String longestCommonPrefix(String[] strs)
   {

      int lo=0;
      int hi = strs[0].length() -1;
      int mid = lo + (hi-lo)/2 + 1;

      int INDEX=0;

      while(lo < hi-1)
      {
         System.out.println("lo and mid and hi:  " + lo + "   " + mid + "  " + hi + "   " + INDEX);
         if(isCommonPrefix(strs, lo,mid))
         {
            INDEX=mid;
            System.out.println("INSIDE IF " + INDEX);
            lo = mid+1;     // going right
            mid = lo + (hi-lo)/2 + 1;
         }else
         {
            hi = mid;    // going left
            mid = lo + (hi-lo)/2 + 1;
         }
      }

      return strs[0].substring(0,INDEX);

   }

   private boolean isCommonPrefix(String[] strs, int s1, int s2)
   {
      String firstString = strs[0].substring(s1,s2);
      for(int i = 1; i < strs.length; i++)
      {
          if(!strs[i].substring(s1,s2).equals(firstString))
          {
             return false;
          }
      }

      return true;
   }


   public static void main(String[] args)
   {
      System.out.println("Hello Longest Common Prefix");

      String[] strs = {"flower", "flow", "flight"};

      LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

      System.out.println("Shoudl be fl:  " + longestCommonPrefix.longestCommonPrefix(strs));
   }


}
