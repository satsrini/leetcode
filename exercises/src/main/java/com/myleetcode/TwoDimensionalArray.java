package com.myleetcode;


/**
 * <h1>TwoDimensionalArray</h1>
 * This class finds the number of possible paths from the given source coordinate to the given destination coordinate
 * in a recursive manner in a two dimensinal array. It is assumed that the traversals can be done only in 
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
      * sx,sy - source coordinates
      * dx,dy - destination coordinates
      **/

    public int solution(int sx, int sy, int dx, int dy)
    {

       if(sx > dx || sy > dy || (sx == dx && sy == dy))
       {
           return 0;
       }

       return paths(sx,sy,dx,dy);

    }

    private int paths(int sx, int sy, int dx, int dy)
    {
       int count = 0;

       if(sx == dx && sy == dy)
       {
          return 1;
       }

       if(sx < dx)
       {
           count = count + paths(sx+1,sy,dx,dy); // going down
       }
 
       if(sy < dy)
       {
           count = count + paths(sx,sy+1,dx,dy); // going right
       }

       return count;
    }

    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 0;
        int sy = 0;
        int dx = 0;
        int dy = 0;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 0:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/

    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 3;
        int sy = 2;
        int dx = 3;
        int dy = 3;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 1:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/


    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 2;
        int sy = 2;
        int dx = 3;
        int dy = 2;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 1 again:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/


    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 3;
        int sy = 2;
        int dx = 4;
        int dy = 3;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 2:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/

    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 2;
        int sy = 1;
        int dx = 3;
        int dy = 3;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 3:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/

    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 1;
        int sy = 0;
        int dx = 3;
        int dy = 2;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 6:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/


    public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 0;
        int sy = 0;
        int dx = 4;
        int dy = 3;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be BIG:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }


    /*public static void main(String[] args)
    {
        System.out.println("Hello TwoDimensionalArray");

        int sx = 4;
        int sy = 3;
        int dx = 0;
        int dy = 0;

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        System.out.println("Should be 0 again:  " + twoDimensionalArray.solution(sx,sy,dx,dy));
    }*/


}
