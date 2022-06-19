package com.myleetcode;


/**
 * <h1>TwoDimensionalArray</h1>
 * This class finds the number of possible paths from the given source coordinate to the given destination coordinate
 * in a recursive manner for the given two dimensinal array. It is assumed that the traversals can be done only in 
 * 'right' and 'down' directions.
 * Actual problem statement:   "Count the number of ways to reach from a source to destination in a 2D integer array if * you can go in 2 directions - right and down."
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-06-19
 */

public class TwoDimensionalArray
{

    public TwoDimensionalArray()
    {

    }

    /**
      * a - given 2D array
      * sx,sy - source coordinates
      * dx,dy - destination coordinates
      **/

    public int solution(int[][] a, int sx, int sy, int dx, int dy)
    {

       if(a == null || a.length == 0 || sx > dx || sy < dy || (sx == dx && sy == dy))
       {
           return 0;
       }

       return paths();

    }

    private int paths()
    {
       return 0;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");
    }

}
