package com.myleetcode;

import java.util.List;
import java.util.ArrayList;


/**
 * <h1>SpiralMatrix</h1>
 * This class implements SpiralMatrix solution
 * <p> SpiralMatrix qn can be found in https://leetcode.com/problems/spiral-matrix/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2021-12-07
 */


public class SpiralMatrix
{

   public SpiralMatrix()
   {
 
   }


   public List<Integer> spiralOrder(int[][] matrix)
   {
       if(matrix == null || matrix.length == 0)
       {
          return null;
       }

       List<Integer> result = new ArrayList<>();

       int m = matrix.length;
       int n = matrix[0].length;
       int k = m*n;

       int row = 0;
       int col = 0;
       int count = 0;

       while(result.size() < k)
       {
          for(row=count, col = count;col < n-count; col++)
          {
            result.add(matrix[row][col]);
          }
          col--;
          row++;

          if(result.size() >= k)
          {
             break;
          } 

          for(;row < m-count;row++)
          {
              result.add(matrix[row][col]);
          }

          if(result.size() >= k)
          {
             break;
          }

           
          row--;
          col--;

          for(;col >= count; col--)
          {
             result.add(matrix[row][col]);
          }

          if(result.size() >= k)
          {
             break;
          }


          col++;
          row--;
          for(;row > count; row--)
          {
             result.add(matrix[row][col]);
          }
          
          count++;
          
       }

       return result;
   }

   public static void main(String[] args)
   {
       int[][] matrix = new int[3][3];

       matrix[0][0] = 1;
       matrix[0][1] = 2;
       matrix[0][2] = 3;
       matrix[1][0] = 4;
       matrix[1][1] = 5;
       matrix[1][2] = 6;
       matrix[2][0] = 7;
       matrix[2][1] = 8;
       matrix[2][2] = 9;

       //List<Integer> myList = new SpiralMatrix().spiralOrder(matrix);
       //System.out.println(myList);


       int[][] matrix2 = new int[3][4];

       matrix2[0][0] = 1;
       matrix2[0][1] = 2;
       matrix2[0][2] = 3;
       matrix2[0][3] = 4;
       matrix2[1][0] = 5;
       matrix2[1][1] = 6;
       matrix2[1][2] = 7;
       matrix2[1][3] = 8;
       matrix2[2][0] = 9;
       matrix2[2][1] = 10;
       matrix2[2][2] = 11;
       matrix2[2][3] = 12;

       List<Integer> myList2 = new SpiralMatrix().spiralOrder(matrix2);
       System.out.println(myList2);
       

   }

}
