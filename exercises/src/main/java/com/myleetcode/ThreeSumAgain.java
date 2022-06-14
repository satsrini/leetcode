package com.myleetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>ThreeSumAgain</h1>
 * This class implements the ThreeSum problem found in leetcode.
 * https://leetcode.com/problems/3sum/
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-06-13
 */
public class ThreeSumAgain
{

   public List<List<Integer>> threeSum(int[] nums)
   {

      if(nums.length < 3)
      {
         return new ArrayList<>();
      }

      Arrays.sort(nums);

      List<List<Integer>> result = new ArrayList<>();

      int i = 0;
      int j = 1;
      int k = nums.length-1;

      while(i < nums.length-2)
      {
         while(j < k)
         {

         }
      }
    
      return result;

   }


}
