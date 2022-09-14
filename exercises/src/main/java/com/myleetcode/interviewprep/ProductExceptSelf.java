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

       int[] left = new int[N];
       int[] right = new int[N];

       left[0] = 1;
       int product = 1;
       for(int i = 1; i < N; i++)
       {
          left[i] = product*nums[i-1];
          product = product*nums[i-1];
       }

       right[N-1] = 1;
       product = 1;
       for(int i = N-2; i >=0; i--)
       {
          right[i] = product*nums[i+1];
          product = product*nums[i+1];
       }

       for(int i = 0; i < nums.length; i++)
       {
          nums[i] = left[i]*right[i];
       }

       return nums;
       
    }

    public static void main(String[] args)
    {
       System.out.println("Hello productExceptSelf");

       int[] nums = {1,2,3,4};

       ProductExceptSelf productExceptSelf = new ProductExceptSelf();

       nums = productExceptSelf.productExceptSelf(nums);

       System.out.println("\n\n");
       for(int k:nums)
       {
         System.out.print(" " + k);
       }

       System.out.println("\n\n");

    }
    

}
