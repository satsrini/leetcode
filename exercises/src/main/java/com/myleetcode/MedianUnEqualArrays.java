package com.myleetcode;


/**
 * <h1>MedianUnEqualArrays</h1>
 * This class finds the median of two sorted integer arrays of unequal length.
 * Leetcode - https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-06-19
 */

public class MedianUnEqualArrays
{

    public MedianUnEqualArrays()
    {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {

        if(nums1.length == 0 && nums2.length == 0)
        {
           return 0.0;
        }

        if(nums1.length == 0)
        {
           return median(nums1);
        }

        if(nums2.length == 0)
        {
           return median(nums2);
        }


        return median(nums1, nums2, 0, nums1.length-1, 0, nums2.length-1);
    }

    private double median(int[] a, int[] b, int ai, int aj, int bi, int bj)
    {
        return 0.0;
    }

    private double median(int[] a)
    {
       int k = a.length;
       if(k%2 ==1) // length is odd, so middle number
       {
          return a[k/2];
       }

       return ((double)(a[(k-1)/2] + a[k/2]))/2;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello Unequal arrays");
    }

}
