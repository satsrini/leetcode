package com.myleetcode;

import java.util.Set;
import java.util.HashSet;

/**
 * <h1>LongestSubstring</h1>
 * This class implements LongestSubstring solution
 * <p> LongestSubstring qn can be found in https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2021-12-05
 */



public class LongestSubstring
{

    public LongestSubstring(){}

    public int lengthOfLongestSubstring(String s)
    {

       if(s == null || s.length() == 0)
       {
           return 0;
       }

       if(s.length() == 1)
       {
          return 1;
       }

       int max = 0;

       Set<Character> mySet = new HashSet<>();

       int startIndex = 0;
       char start = s.charAt(startIndex);
       mySet.add(start);
       char end = start;

       int count = 1;

       while(count < s.length())
       {
          end = s.charAt(count);

          if(mySet.contains(end))
          {
             max = Math.max(max,count-startIndex);
             mySet.remove(s.charAt(startIndex));
             startIndex++;
          }else
          {
             mySet.add(end);
             max = Math.max(max,count + 1 -startIndex);
             count++;
          }

       }

       return max;

    }

    public static void main(String[] args)
    {
       System.out.println(new LongestSubstring().lengthOfLongestSubstring("abcabcbb"));
       System.out.println(new LongestSubstring().lengthOfLongestSubstring("bbbbbbbbbbbbb"));

       System.out.println(new LongestSubstring().lengthOfLongestSubstring("pwwkew"));

       System.out.println(new LongestSubstring().lengthOfLongestSubstring(" "));
      
    }


}
