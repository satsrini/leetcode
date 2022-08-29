package com.myleetcode.interviewprep;

/**
 * <h1>StrStr.java</h1>
 * This class implements StrStr solution.
 * <p> StrStr qn can be found in https://leetcode.com/problems/implement-strstr/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-29
 */

public class StrStr
{
    public StrStr(){}

    public int strStr(String haystack, String needle)
    {

       if(needle.length() > haystack.length())
       {
           return -1;
       }

       if(needle.equals(haystack))
       {
           return 0;
       }

       int resultIndex = -1;
       int count = 0;
       while( count < haystack.length()-needle.length())
       {

          if(haystack.substring(count, count+needle.length()).equals(needle))
          {
              resultIndex = count;
              break;
          }
          
          count++;

       }

       return resultIndex;
    }


    public static void main(String[] args)
    {
        System.out.println("Hello StrStr");

        StrStr strStr = new StrStr();
        String haystack = "hello";
        String needle = "ll";

        System.out.println("Should be 2:   " + strStr.strStr(haystack, needle));

    }

}
