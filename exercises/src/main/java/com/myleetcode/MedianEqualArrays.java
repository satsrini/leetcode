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

       result = median(a, 0, a.length-1, b, 0, b.length-1);


       return result;
    }

    private double median(int[] a, int ai, int aj, int[] b, int bi, int bj)
    {
        int aDiff = aj-ai;
   
        if(aDiff >=0 && aDiff <=1)  // if the diff is either 0 or 1
        {

            if(aDiff == 0)
            {
                return (double)(a[aj] + b[bi]/2);
            }

            if(a[aj] <= b[bi]) // 
            {

            }           
        }

        return 0.0;
    }

}
