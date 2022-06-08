package com.myleetcode;


/**
 * <h1>MedianEqualArrays</h1>
 * This class finds the median of two sorted integer arrays of equal length.
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-06-07
 */

public class MedianEqualArrays
{

    public MedianEqualArrays()
    {

    }


    /*
     *  assumptions: a.length == b.length
     *               a.length >= 1
     */
    public double solution(int[] a, int[] b)
    {
       double result = 0;

       if(a.length == 1)
       {
          return (double)((a[0] + b[0])/2);
       }


       return result;
    }

}
