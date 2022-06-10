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
        //dummy constructor
    }


    /*
     *  assumptions: a.length == b.length
     *               a.length >= 1
     */
    public double solution(int[] a, int[] b)
    {

       if(a.length == 1)
       {
          return (double)((a[0] + b[0])/2);
       }

       int n = a.length;

       if(a[n-1] <= b[0])
       {
          return (double)((a[n-1] + b[0])/2);
       }

       if(a[0] >= b[n-1])
       {
          return (double)((a[n-1] + b[0])/2);
       }

       // if middle values are equal, then it is straight forward to calculate median
       if(a[n/2] == b[n/2])
       {
          if(n % 2 == 0) // length is even
          {
             return (double)(a[n/2]);
          }else // length is odd
          {
             if(a[n/2 + 1] == b[n/2+1] || a[n/2 + 1] < b[n/2+1])
             {
                return (double)((a[n/2]+a[n/2 + 1])/2);
             }else
             {
                return (double)((a[n/2]+b[n/2 + 1])/2);
             }
          }
       }

       return median(a, 0, n-1, b, 0, n-1);
    }

    private double median(int[] a, int ai, int aj, int[] b, int bi, int bj)
    {
        
        int aDiff = aj-ai+1;

        if(aDiff == 1)
        {

        }


        return 0.0;
   
    }

}
