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

       return median(a, 0, a.length-1, b, 0, b.length-1);
    }

    private double median(int[] a, int ai, int aj, int[] b, int bi, int bj)
    {

        
        int aDiff = aj-ai+1;
        int bDiff = bj-bi+1;

        if(aDiff%2 == 1) // odd
        {
           if(a[aDiff/2] == b[bDiff/2])
           {
              return a[aDiff/2];
           }
        }else // even
        {

           if(a[aDiff/2] == b[bDiff/2] && a[aDiff/2 + 1] == b[bDiff/2 + 1])
           {
              return (double)(a[aDiff/2] + a[aDiff/2 + 1]/2);           
           }

        }

        return 0.0;
   
    }

}
