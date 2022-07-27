package com.myleetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * <h1>PascalsTriangle2Ver2.java</h1>
 * This class implements PascalsTriangle2Ver2 solution.
 * <p> PascalsTriangle2 qn can be found in https://leetcode.com/problems/pascals-triangle-ii/
 * This fixes the follow up goal "Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?"
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-27
 */
public class PascalsTriangle2Ver2
{

  public PascalsTriangle2Ver2()
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

    List<Integer> DP = getOne();

    int left = 0;
    int right = 0;

    for(int i = 2; i <= rowIndex; i++)
    {
       left = DP.get(0);
       for(int j = 1; j < i; j++)
       {
           right = DP.get(j);
           DP.remove(j);
           DP.add(j,left+right);
           left = right; 
       }
       DP.add(i,1);
    }

    return DP;
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
    System.out.println("Hello PascalsTriangle2Ver2");

    PascalsTriangle2Ver2 pascalsTriangle2Ver2 = new PascalsTriangle2Ver2();

    System.out.println("Should be [1,4,6,4,1]     " + pascalsTriangle2Ver2.getRow(4));


  }
}
