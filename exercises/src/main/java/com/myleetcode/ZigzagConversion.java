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

       if(s == null || s.length() <= numRows || numRows==1)
       {
          return s;
       }

       StringBuilder[] rows = new StringBuilder[numRows];

       for(int i = 0; i < rows.length; i++)
       {
          rows[i] = new StringBuilder();
       }
      
       boolean goingDown = false;
       StringBuilder result = new StringBuilder();
       int currentRow = 0;

       for(int i = 0; i < s.length(); i++)
       {
          StringBuilder row = rows[currentRow];
          row.append(s.charAt(i));

          if(currentRow == 0 || currentRow == numRows-1)
          {
              goingDown = !goingDown;
          }

          if(goingDown)
          {
             currentRow++;
          }else
          {
             currentRow--;
          }
       }      

       for(StringBuilder row:rows)
       {
          result.append(row);
       }

       return result.toString();

    }

    /*public static void main(String[] args)
    {
       System.out.println("Hello Zigzag conversion");

       String s = "PAYPALISHIRING";

       ZigzagConversion zigzagConversion = new ZigzagConversion();

       System.out.println("Should be PAHNAPLSIIGYIR   " + zigzagConversion.convert(s,3));

    }*/

    /*public static void main(String[] args)
    {
       System.out.println("Hello Zigzag conversion");

       String s = "PAYPALISHIRING";

       ZigzagConversion zigzagConversion = new ZigzagConversion();

       System.out.println("Should be PINALSIGYAHRPI   " + zigzagConversion.convert(s,4));

    }*/

    public static void main(String[] args)
    {
       System.out.println("Hello Zigzag conversion");

       String s = "AB";

       ZigzagConversion zigzagConversion = new ZigzagConversion();

       System.out.println("Should be AB   " + zigzagConversion.convert(s,1));

    }



}



