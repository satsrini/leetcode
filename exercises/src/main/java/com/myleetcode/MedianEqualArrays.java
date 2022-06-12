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
          return ((double)(a[0] + b[0]))/2;
       }

       int n = a.length;

       if(a[n-1] <= b[0])   //{a[0],a[n-1], b[0], b[n-1] }
       {
          System.out.println("IN 1");
          return ((double)(a[n-1] + b[0]))/2;
       }

       if(a[0] >= b[n-1]) //{b[0],b[n-1], a[0], a[n-1] }
       {
          System.out.println("IN 2");

          return ((double)(a[0] + b[n-1]))/2;
       }

       // if middle values are equal, then it is straight forward to calculate median
       int midIndex = (n+1)/2-1; 
       if(a[midIndex] == b[midIndex])
       {
          System.out.println("IN 3");

          if(n % 2 == 1) // length is odd
          {
             return (double)(a[n/2]);
          }else // length is even
          {
             if(a[n/2 + 1] == b[n/2+1] || a[n/2 + 1] < b[n/2+1])
             {
                return ((double)(a[n/2]+a[n/2 + 1]))/2;
             }else
             {
                return ((double)(a[n/2]+b[n/2 + 1]))/2;
             }
          }
       }

       return median(a, 0, n-1, b, 0, n-1);
    }

    private double median(int[] a, int ai, int aj, int[] b, int bi, int bj)
    {

        System.out.println("In Median: " + ai + " " + aj + " " + bi + " " + bj);
        
        int aDiff = aj-ai;

        if(aDiff == 1) // coming to the end, time to calculate the combined median
        {

            System.out.println("Diff is 1: " + ai + " " + aj + " " + bi + " " + bj);

            if(a[aj] <= b[bi]) // {a[ai],a[aj],b[bi],b[bj]}
            {
                return ((double)(a[aj]+b[bi]))/2;
            }

            if(a[ai] >= b[bj]) // {b[bi],b[bj],a[ai],a[aj]}
            {
                return ((double)(a[ai]+b[bj]))/2;
            }

            if(a[ai] >= b[bi] && a[aj] <= b[bj]) // {b[bi],a[ai],a[aj],b[bj]}
            {
                return ((double)(a[ai]+a[aj]))/2;
            }

            return ((double)(b[bi]+b[bj]))/2; // {a[ai],b[bi],b[bj],a[aj]}
        }

        int aMidIndex = ai + aDiff/2;
        int bMidIndex = bi + aDiff/2;

        if(a[aMidIndex] >= b[bMidIndex])
        {
           return median(a,ai,aMidIndex,b,bMidIndex, bj);
        }else
        {
           return median(a,aMidIndex,aj,b,bi,bMidIndex);
        }
       
    }

    /*public static void main(String[] args)
    {
       int[] a = {1,3,4,6,6,7}; 
       int[] b = {9,10,11,12,13,13};

       MedianEqualArrays medianEqualArrays = new MedianEqualArrays();

       System.out.println("8 is the answer: " + medianEqualArrays.solution(a,b));
    }*/

    /*public static void main(String[] args)
    {
       int[] a = { 5,8,10,11,14,15,17 };
       int[] b = { -17,-15,-12,0,1,2,2 };

       MedianEqualArrays medianEqualArrays = new MedianEqualArrays();

       System.out.println("3.5 is the answer: " + medianEqualArrays.solution(a,b));
    }*/

    public static void main(String[] args)
    {

       int[] a = {1,4,7,8 };
       int[] b = { 5,6,7,9 };

       MedianEqualArrays medianEqualArrays = new MedianEqualArrays();

       System.out.println("6.5 is the answer: " + medianEqualArrays.solution(a,b));
    }

   /*public static void main(String[] args)
   {
     int a = 2;
     int b = 5;

     double c = ((double)(a+b))/2;

     System.out.println(c);
   }*/


}
