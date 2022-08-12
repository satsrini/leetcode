package com.myleetcode.interviewprep;

import java.util.Arrays;

/**
 * <h1>MaxUnitsOnTruck.java</h1>
 * This class implements MaxUnitsOnTruck solution.
 * <p> MaxUnitsOnTruck qn can be found in https://leetcode.com/problems/maximum-units-on-a-truck/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-10
 */
public class MaxUnitsOnTruck
{
   public MaxUnitsOnTruck(){}

   public int maximumUnits(int[][] boxTypes, int truckSize) 
   {
       int max = 0;

       Arrays.sort(boxTypes, (a, b) -> (b[1]-a[1]));

       for(int i = 0; i < boxTypes.length; i++)
       {
          max += Math.min(truckSize, boxTypes[i][0])*boxTypes[i][1];
          truckSize -= boxTypes[i][0];

          if(truckSize <= 0)
          {
             break;
          }

       }

       return max;
   }  

   public static void main(String[] args)
   {
      System.out.println("Hello MaxUnitsOnTruck");

      int[][] boxTypes = {{1,3},{2,2},{3,1}};

      MaxUnitsOnTruck maxUnitsOnTruck = new MaxUnitsOnTruck();

      System.out.println("Should be 8:   " + maxUnitsOnTruck.maximumUnits(boxTypes,4));

   }

}
