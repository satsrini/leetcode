package com.myleetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>PascalsTriangle.java</h1>
 * This class implements PascalsTriangle solution using Dynamic Programming.
 * <p> PascalsTriangle qn can be found in https://leetcode.com/problems/pascals-triangle/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-23
 */
public class PascalsTriangle
{

  public PascalsTriangle()
  {

  }

  public List<List<Integer>> generate(int numRows)
  {
     if(numRows <= 0)
     {
        return null;
     }

     if(numRows == 1)
     {
        return getForOne();
     }

     if(numRows == 2)
     {
        return getForTwo();
     }


     List<List<List<Integer>>> DP = new ArrayList<>();

     DP.add(getForOne());
     DP.add(getForTwo());

     for(int i = 2; i < numRows; i++)
     {
        List<Integer> currentList = new ArrayList<>();

        currentList.add(1);

        List<Integer> prev = DP.get(i-1).get(DP.get(i-1).size()-1);
        
        for(int j = 1; j < i; j++)
        {
           currentList.add(j,prev.get(j-1) + prev.get(j));
        }
        currentList.add(1);

        DP.add(new ArrayList<>());
        DP.get(i).addAll(DP.get(i-1)); // This is where Dynamic Programming is used
        DP.get(i).add(currentList);
        

     }

     return DP.get(numRows-1);
  }

  private List<List<Integer>> getForOne()
  {
        Integer[] result = {1};
  
        List<List<Integer>> allResults = new ArrayList<>();
        allResults.add(Arrays.asList(result));

        return allResults;
  }

  private List<List<Integer>> getForTwo()
  {

        List<List<Integer>> allResults = new ArrayList<>();

        Integer[] result = {1};
        allResults.add(Arrays.asList(result));

        Integer[] result2 = {1,1};        
        allResults.add(Arrays.asList(result2));

        return allResults;
  }

  /*public static void main(String[] args)
  {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(5));
  }*/

  public static void main(String[] args)
  {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(2));
  }


}
