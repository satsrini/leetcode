package com.myleetcode.interviewprep;

public class ProductExceptSelf
{

    public ProductExceptSelf(){}

    public int[] productExceptSelf(int[] nums)
    {

       if(nums == null || nums.length == 0)
       {
          return nums;
       }

       int N = nums.length;

       int[] left = new nums[N];
       int[] right = new nums[N];

       // processing from left
       int product = 1;
       for(int i = 1; i < N; i++)
       {
          left[i] = product*left[i-1];
       }

       // processing from right
       product = 1;
       for(int i = N-2; i >= 0; i--)
       {
          right[i] = product*right[i+1];
       }

       for(int i = 0; i < N; i++)
       {
          nums[i] = left[i]*right[i];
       }
       
    }

    public static void main(String[] args)
    {
       System.out.println("Hello productExceptSelf");
    }
    

}
