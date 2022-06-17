package com.myleetcode;


/**
 * <h1>MedianEqualArrays</h1>
 * This class finds the median of two sorted integer arrays of equal length. (Version 2)
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-06-15
 */

public class MedianEqualArrays2
{

    public MedianEqualArrays2()
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
          return ((double)(a[n-1] + b[0]))/2;
       }

       if(a[0] >= b[n-1]) //{b[0],b[n-1], a[0], a[n-1] }
       {
          return ((double)(a[0] + b[n-1]))/2;
       }

       return median(a, 0, n-1, b, 0, n-1);
    }

    private double median(int[] a, int ai, int aj, int[] b, int bi, int bj)
    {

        int aDiff = aj-ai+1;

        if(aDiff <= 2) // coming to the end, time to calculate the combined median
        {

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

        int aDiffActual = (aDiff%2 == 0) ? (aDiff-1):aDiff;

        int aMidIndex = ai + aDiffActual/2;
        int bMidIndex = bi + aDiffActual/2;

        if(a[aMidIndex] == b[bMidIndex]) // if current mid values are equal, then we go for median calculation
        {
            if((aDiff) % 2 == 1) // odd length, so single medians in each array
            {
               return (double)a[aMidIndex];
            }else // even length
            {
               return ((double)(a[aMidIndex]+Math.min(a[aMidIndex+1],b[bMidIndex+1])))/2;
            }
           
        }

        int aMiddle = aMidIndex;
        int bMiddle = bMidIndex;

        if(a[aMidIndex] > b[bMidIndex])
        {
           if(aDiff % 2 == 0)
           {
              aMiddle++;
           }
           return median(a,ai,aMiddle,b,bMiddle,bj);
        }else
        {
           if(aDiff % 2 == 0)
           {
              bMiddle++;
           }
           return median(a,aMiddle,aj,b,bi,bMiddle);
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

       MedianEqualArrays2 medianEqualArrays2 = new MedianEqualArrays2();

       System.out.println("3.5 is the answer: " + medianEqualArrays2.solution(a,b));
    }*/

    /*public static void main(String[] args)
    {

       int[] a = {1,4,7,8 };
       int[] b = { 5,6,7,9 };

       MedianEqualArrays2 medianEqualArrays2 = new MedianEqualArrays2();

       System.out.println("6.5 is the answer: " + medianEqualArrays2.solution(a,b));
    }*/

    /*public static void main(String[] args)
    {

       int[] a = { 1,4,7,8,10 };
       int[] b = { 2,5,6,7,9 };

       MedianEqualArrays2 medianEqualArrays2 = new MedianEqualArrays2();

       System.out.println("again 6.5 is the answer: " + medianEqualArrays2.solution(a,b));
    }*/

    public static void main(String[] args)
    {

       int[] a = { 1,2,3,7,9,10,11,13,14};
       int[] b = { -1,0,3,5,6,7,8,12,15};

       MedianEqualArrays2 medianEqualArrays2 = new MedianEqualArrays2();

       System.out.println("7 is the answer: " + medianEqualArrays2.solution(a,b));
    }



   /*public static void main(String[] args)
   {
     int a = 2;
     int b = 5;

     double c = ((double)(a+b))/2;

     System.out.println(c);
   }*/


}
