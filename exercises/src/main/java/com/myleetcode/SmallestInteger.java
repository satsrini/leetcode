package com.myleetcode;

import java.util.List;
import java.util.ArrayList;

public class SmallestInteger
{

    public int solution(int[] nums)
    {
       List<Integer> myList = new ArrayList<>();
       int minValue = 1;
       for(int i:nums)
       {
          if(i < 1)
          {
            continue;
          }
          myList.add(i);
       }

       while(myList.contains(minValue))
       {
          minValue++;
       }

       return minValue;
    }

    public static void main(String[] args)
    {
       int[] nums = {1,3,6,4,1,2};

       System.out.println(new SmallestInteger().solution(nums));

       int[] nums2 = {1,2,3};

       System.out.println(new SmallestInteger().solution(nums2));

       int[] nums3 = {-1,-3};

       System.out.println(new SmallestInteger().solution(nums3));

       int[] nums4 = {-1,-5,0,6,2,7,4};

       System.out.println(new SmallestInteger().solution(nums4));




    }


}
