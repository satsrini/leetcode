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
           int j = 0;
      
           while((i+j) < s.length())
           {

              j += 2*numRows-2*(i+1);

              
              if(i < (numRows-1) && j != 0) 
              {
                if((i+j) < s.length())
                {
                   System.out.println("inside while1, I is " + i + ", J is " + j);
                   sbuilder.append(s.charAt(i+j));
                }else
                {
                   break;
                }
              }

              if(i == 0)
              {
                 continue;
              }

              j += 2*i;

              if((i+j) < s.length())
              {
                 System.out.println("inside while2, I is " + i + ", J is " + j);
                 sbuilder.append(s.charAt(i+j));
              }else
              {
                 break;
              }
 
           }
       }

       return sbuilder.toString();

    }

    /*public static void main(String[] args)
    {
       System.out.println("Hello Zigzag conversion");

       String s = "PAYPALISHIRING";

       ZigzagConversion zigzagConversion = new ZigzagConversion();

       System.out.println("Should be PAHNAPLSIIGYIR   " + zigzagConversion.convert(s,3));

    }*/

    public static void main(String[] args)
    {
       System.out.println("Hello Zigzag conversion");

       String s = "PAYPALISHIRING";

       ZigzagConversion zigzagConversion = new ZigzagConversion();

       System.out.println("Should be PINALSIGYAHRPI   " + zigzagConversion.convert(s,4));

    }


}



