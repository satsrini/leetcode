package com.myleetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * <h1>Triangle.java</h1>
 * This class implements Triangle solution using Recursion.
 * <p> Triangle qn can be found in https://leetcode.com/problems/triangle/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-29
 */

public class Triangle
{

  public Triangle()
  {

  }

  public int minimumTotal(List<List<Integer>> triangle)
  {
     if(triangle == null || triangle.size() == 0)
     {
        return 0;
     }

     int sum = min(triangle, 0, 0);

     return sum;
  }

  private int min(List<List<Integer>> triangle, int row, int index)
  {
     if(row >= triangle.size())
     {
        return 0;
     }

     return triangle.get(row).get(index) + Math.min(min(triangle, row+1, index), min(triangle, row+1, index+1));
  }

  public static void main(String[] args)
  {
     System.out.println("Hello Triangle");

     List<List<Integer>> triangle = new ArrayList<>();

     List<Integer> row = new ArrayList<>();
     row.add(2);
     triangle.add(row);

     row = new ArrayList<>();
     row.add(3);
     row.add(4);
     triangle.add(row);

     row = new ArrayList<>();
     row.add(6);
     row.add(5);
     row.add(7);
     triangle.add(row);

     row = new ArrayList<>();
     row.add(4);
     row.add(1);
     row.add(8);
     row.add(3);
     triangle.add(row);

     Triangle triangleObject = new Triangle();
     System.out.println("Should be 11:  " + triangleObject.minimumTotal(triangle));

  }


}
