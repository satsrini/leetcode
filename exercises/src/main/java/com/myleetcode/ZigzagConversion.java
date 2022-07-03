package com.myleetcode;


/**
 * <h1>ZigzagConversion</h1>
 * This class gets the zigzag conversion of a given String
 * <p> Zigzag Conversion qn can be found in https://leetcode.com/problems/zigzag-conversion/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-03
 */

public class ZigzagConversion
{

    public ZigzagConversion()
    {

    }

    public String convert(String s, int numRows)
    {

       if(s == null || s.length() <= numRows )
       {
          return s;
       }

       StringBuilder sbuilder = new StringBuilder();

       for(int i = 0; i < numRows; i++)
       {
           sbuilder.append(s.charAt(i));
       }

       return sbuilder.toString();

    }

    public static void main(String[] args)
    {
       System.out.println("Hello Zigzag conversion");
    }

}
