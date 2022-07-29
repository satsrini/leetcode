package com.myleetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * <h1>Triangle.java</h1>
 * This class implements Triangle solution using Dynamic Programming.
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

     int sum = triangle.get(0).get(0);

     if(triangle.size() == 1)
     {
        return sum;
     }

     int[] DPindex = new int[triangle.size()];

     DPindex[0] = 0;

     for(int i = 1; i < DPindex.length; i++)
     {
        List<Integer> currentRow = triangle.get(i);
        DPindex[i] = DPindex[i-1]; // We are DPing here

        if(currentRow.get(DPindex[i]) > currentRow.get(DPindex[i]+1))
        {
          DPindex[i]++;
        }  
 
        sum += currentRow.get(DPindex[i]);
     }     

     return sum;
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
