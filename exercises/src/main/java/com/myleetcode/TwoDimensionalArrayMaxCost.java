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

      if(sx > dx || sy > dy || (sx == dx && sy == dy))
      {
         return 0;
      }

      int cost = 0;
      calculateMaxCost(sx,sy,dx,dy,cost);

      return maxCost;
   }

   private void calculateMaxCost(int sx, int sy, int dx, int dy, int cost)
   {

       if(sx == dx && sy == dy) // target found
       {
           if(cost > maxCost)
           {
              maxCost = cost;
           }
           return;
       }

       if(sx < dx && sy < dy) // cost becomes 3
       {
          calculateMaxCost(sx+1,sy,dx,dy,cost+3); // going down 
          calculateMaxCost(sx,sy+1,dx,dy,cost+3); // going right
       }else
       if(sx < dx) // cost becomes 2
       {
          calculateMaxCost(sx+1,sy,dx,dy,cost+2); // going down as the only option
       }else // cost becomes 1
       {
          calculateMaxCost(sx,sy+1,dx,dy,cost+1); // going right as the only option
       }

   }

   /*public static void main(String[] args)
   {
       System.out.println("Hello TwoDimensionalArrayMaxCost");

       TwoDimensionalArrayMaxCost twoDimensionalArrayMaxCost
                                         = new TwoDimensionalArrayMaxCost();

       int sx=0;
       int sy=0;
       int dx=0;
       int dy=0;       

       System.out.println("Should be 0:   " + twoDimensionalArrayMaxCost.solution(sx,sy,dx,dy));
   }*/

   /*public static void main(String[] args)
   {
       System.out.println("Hello TwoDimensionalArrayMaxCost");

       TwoDimensionalArrayMaxCost twoDimensionalArrayMaxCost
                                         = new TwoDimensionalArrayMaxCost();

       int sx=3;
       int sy=2;
       int dx=4;
       int dy=3;

       System.out.println("Should be 5:   " + twoDimensionalArrayMaxCost.solution(sx,sy,dx,dy));
   }*/


   public static void main(String[] args)
   {
       System.out.println("Hello TwoDimensionalArrayMaxCost");

       TwoDimensionalArrayMaxCost twoDimensionalArrayMaxCost
                                         = new TwoDimensionalArrayMaxCost();

       int sx=0;
       int sy=0;
       int dx=4;
       int dy=3;

       System.out.println("Should be 20:   " + twoDimensionalArrayMaxCost.solution(sx,sy,dx,dy));
   }

   /*public static void main(String[] args)
   {
       System.out.println("Hello TwoDimensionalArrayMaxCost");

       TwoDimensionalArrayMaxCost twoDimensionalArrayMaxCost
                                         = new TwoDimensionalArrayMaxCost();

       int sx=2;
       int sy=2;
       int dx=3;
       int dy=2;
aaasdsad
       System.out.println("Should be 2:   " + twoDimensionalArrayMaxCost.solution(sx,sy,dx,dy));
   }*/

   /*public static void main(String[] args)
   {
       System.out.println("Hello TwoDimensionalArrayMaxCost");

       TwoDimensionalArrayMaxCost twoDimensionalArrayMaxCost
                                         = new TwoDimensionalArrayMaxCost();

       int sx=2;
       int sy=2;
       int dx=3;
       int dy=1;

       System.out.println("Should be 0 again:   " + twoDimensionalArrayMaxCost.solution(sx,sy,dx,dy));
   }*/



}
