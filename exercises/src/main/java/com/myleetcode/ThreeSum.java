package com.myleetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>ThreeSum</h1>
 * This class implements ThreeSum solution
 * <p> Three Sum qn can be found in https://leetcode.com/problems/3sum/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2021-09-21
 */


public class ThreeSum
{

    public List<List<Integer>> threeSum(int[] nums)
    {
       List<List<Integer>> result;

       if(nums == null || nums.length < 3)
       {
          return new ArrayList<>();
       }

       result = new ArrayList<>();

       Arrays.sort(nums);
     
       int j = 0;
       int k = 0;
       int target = 0;

       for(int i = 0; i < (nums.length-2); i++)
       {
          j = i+1;
          k = (nums.length - 1);
          target = nums[i]*-1;
         
          while(j < k)
          {
             if(nums[j] + nums[k] == target)
             {
               result.add(List.of(nums[i], nums[j],nums[k]));
               j++;
               k--;
             }else
             if(nums[j] + nums[k] < target)
             {
                j++;
             }else
             {
                k--;
             }
          }
       }
       

       return result;
    }

}
