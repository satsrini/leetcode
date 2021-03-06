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

      if(nums == null || nums.length < 3)
      {
         return new ArrayList<>();
      }

      Arrays.sort(nums); // sort in ascending order

      if(nums[0] > 0)
      {
        return new ArrayList<>(); // if the smallest number is positive, then no point continuing.
      }

      List<List<Integer>> result = new ArrayList<>();

      int i = 0;
      int j = i+1;
      int k = nums.length-1;

      for(;nums[i] <= 0 && i < nums.length-2;i++)
      {

         if(i > 0 && nums[i] == nums[i-1]) // if the current element is same as previous one,then we can move onto next
         {
            continue;
         }
         j = i+1;
         k = nums.length-1;

         while(j < k)
         {
           if(j > i+1 && nums[j] == nums[j-1]) // if the current element is same as previous one,then we can move onto next
           {
              j++;
              continue;
           }

           if(k < nums.length-1 && nums[k] == nums[k+1]) // if the current element is same as previous one,then we can move onto next
           {
              k--;
              continue;
           }

           if(nums[i] + nums[j] + nums[k] == 0)
           {
               List<Integer> internalList = new ArrayList<>();

               internalList.add(nums[i]);
               internalList.add(nums[j]);
               internalList.add(nums[k]);

               if(!result.contains(internalList)) // to remove duplicate triplets
               {
                  result.add(internalList);
               }
               j++;
               k--;
           }else
           if(nums[i] + nums[j] + nums[k] > 0)
           {
              k--;
           }else // less than 0
           {
              j++;
           }

         }
         j = i+1;
         k = nums.length-1;
      }
    
      return result;

   }

   public static void main(String[] args)
   {
      ThreeSumAgain threeSumAgain = new ThreeSumAgain();

      int[] nums = {-1,0,1,2,-1,-4};

      System.out.println(threeSumAgain.threeSum(nums));

   }

   /*public static void main(String[] args)
   {
      ThreeSumAgain threeSumAgain = new ThreeSumAgain();

      int[] nums = {4,0,2,3,-1};

      System.out.println(threeSumAgain.threeSum(nums));

   }*/


}
