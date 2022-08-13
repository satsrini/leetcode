package com.myleetcode.interviewprep;

/**
 * <h1>ValidTicTacToe.java</h1>
 * This class implements ValidTicTacToe solution.
 * <p> ValidTicTacToe qn can be found in https://leetcode.com/problems/valid-tic-tac-toe-state/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-13
 */


public class ValidTicTacToe
{

   public ValidTicTacToe(){}

   public boolean validTicTacToe(String[] board)
   {

      StringBuilder fullString = new StringBuilder();

      for(String str:board)
      {
         fullString.append(str);
      }

      char[] stringChars = fullString.toString().toCharArray();

      int xCount = 0;
      int oCount = 0;

      for(char c:stringChars)
      {
          if(c == 'X')
          {
             xCount++;
          }else
          if(c == 'O')
          {
            oCount++;
          }

      }

      if(oCount > xCount || oCount < xCount-1)
      {
          return false;
      }

      return true;
   }


   /*public static void main(String[] args)
   {
      System.out.println("Hello ValidTicTacToe");

      ValidTicTacToe validTicTacToe = new ValidTicTacToe();

      String[] board = {"XOX","O O","XOX"};

      System.out.println("Should be true: " + validTicTacToe.validTicTacToe(board));
   }*/

   public static void main(String[] args)
   {
      System.out.println("Hello ValidTicTacToe");

      ValidTicTacToe validTicTacToe = new ValidTicTacToe();

      String[] board = {"XOX"," X ","   "};

      System.out.println("Should be false: " + validTicTacToe.validTicTacToe(board));
   }


}
