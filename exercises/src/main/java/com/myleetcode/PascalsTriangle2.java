package com.myleetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * <h1>PascalsTriangle2.java</h1>
 * This class implements PascalsTriangle2 solution using Dynamic Programming.
 * <p> PascalsTriangle2 qn can be found in https://leetcode.com/problems/pascals-triangle-ii/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-24
 */

public class PascalsTriangle2
{

  public PascalsTriangle2()
  {

  }

  public List<Integer> getRow(int rowIndex)
  {
     if(rowIndex < 0)
     {
        return null;
     }

     if(rowIndex == 0)
     {
        return getZero();
     }

     if(rowIndex == 1)
     {
        return getOne();
     }

     List<List<Integer>> DP = new ArrayList<>();

     DP.add(getZero());
     DP.add(getOne());

     for(int i = 2; i <= rowIndex; i++)
     {
        DP.add(new ArrayList<>());
        List<Integer> currentIndexDP = DP.get(i);
        List<Integer> prevIndexDP = DP.get(i-1); // DPing here

        currentIndexDP.add(1);

        for(int j = 1; j < prevIndexDP.size(); j++)
        {
           currentIndexDP.add(prevIndexDP.get(j-1) + prevIndexDP.get(j));
        }
 
       currentIndexDP.add(1);
        
     }

     return DP.get(rowIndex);  
  }

  private List<Integer> getZero()
  {
     List<Integer> result = new ArrayList<>();

     result.add(1);

     return result;
  }

  private List<Integer> getOne()
  {
     List<Integer> result = new ArrayList<>();

     result.add(1);
     result.add(1);

     return result;
  }

  public static void main(String[] args)
  {
      System.out.println("Hello Pascals Triangle 2");

      PascalsTriangle2 pascalsTriangle2 = new PascalsTriangle2();
      System.out.println("Should be [1,4,6,4,1] :   " + pascalsTriangle2.getRow(4));
  }

}
