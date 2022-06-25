package com.myleetcode;


/**
 * <h1>TwoDimensionalArrayMaxCost</h1>
 * This class finds the max cost incurred when moving from the given source coordinate to the given destination 
 * coordinate in a recursive manner in a two dimensinal array. It is assumed that the traversals can be done only in
 * 'right' and 'down' directions.
 * Every node has cost value 1 or 2 or 3 with the following rules
 * cost 1 - can go right
 * cost 2 - can go down
 * cost 3 - can go both right and down
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-06-25
 */

public class TwoDimensionalArrayMaxCost
{

   private int maxCost = 0;

   public TwoDimensionalArrayMaxCost()
   {

   }

   public int solution(int sx, int sy, int dx, int dy)
   {

      if(sx < dx || sy < dy || (sx == dx && sy == dy))
      {
         return 0;
      }

      int cost = 0;
      calculateMaxCost(sx,sy,dx,dy,cost);

      return maxCost;
   }

   private void calculateMaxCost(int sx, int sy, int dx, int dy, int cost)
   {

   }

   public static void main(String[] args)
   {
       System.out.println("Hello TwoDimensionalArrayMaxCost");
   }

}
