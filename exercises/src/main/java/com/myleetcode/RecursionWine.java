package com.myleetcode;

/**
 * <h1>RecursionWine.java</h1>
 * Using Recursion, this class finds the maximum profit in selling the n wines to n customers with the
 * value gets multiplied by the year no. after every year starting from a particular year.
 *
 * The problem statement can be found here 
 * https://www.hackerearth.com/practice/algorithms/dynamic-programming/introduction-to-dynamic-programming-1/tutorial/
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-07-13
 */

public class RecursionWine
{

  public RecursionWine()
  {

  }

  public int solution(int[] p)
  {
     return price(1, 0, p.length-1,p);
  }

  private int price(int year, int begin, int end, int[] p)
  {

     if(begin > end)
     {
        return 0;
     }

     return Math.max(price(year+1, begin+1,end,p) + year*p[begin],
                     price(year+1, begin,end-1,p) + year*p[end]);
  }

  public static void main(String[] args)
  {
     RecursionWine recursionWine = new RecursionWine();

     int p[] = {2,3,5,1,4};

     System.out.println("Should be 50:   " + recursionWine.solution(p));
     
  }

}
