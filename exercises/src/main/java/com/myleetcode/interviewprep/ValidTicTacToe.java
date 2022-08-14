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

      char[][] elements = new char[3][3];

      int xCount = 0;
      int oCount = 0;

      for(int i = 0; i < board.length; i++)
      {
         char[] row = board[i].toCharArray();
         for(int j=0; j < row.length; j++)
         {
           elements[i][j] = row[j];

           if(row[j] == 'X')
           {
              xCount++;
           }else
           if(row[j] == 'O')
           {
             oCount++;
           }
         }
      }


      if(oCount > xCount || oCount < xCount-1)
      {
          return false;      
      }


      if(isCharWin(elements, 'X') && isCharWin(elements, 'O') )
      {
          return false;
      }

      if(isCharWin(elements, 'X') && xCount == oCount)
      {
          return false;
      }


      if(isCharWin(elements, 'O') && xCount > oCount)
      {
          return false;
      }


      return true;
   }

   private boolean isCharWin(char[][] elements, char c)
   {
      for(int i = 0; i < 3;i++)
      {
         if(elements[i][0] == c && elements[i][1] ==c && elements[i][2] == c)
         {
            return true;
         }

         if(elements[0][i] == c && elements[1][i] ==c && elements[2][i] == c)
         {
            return true;
         }
      }

      if(elements[0][0] == c && elements[1][1] ==c && elements[2][2] == c)
      {
         return true;
      }

      if(elements[0][2] == c && elements[1][1] ==c && elements[2][0] == c)
      {
         return true;
      }

      return false;

   }


   /*public static void main(String[] args)
   {
      System.out.println("Hello ValidTicTacToe");

      ValidTicTacToe validTicTacToe = new ValidTicTacToe();

      String[] board = {"XOX","O O","XOX"};

      System.out.println("Should be true: " + validTicTacToe.validTicTacToe(board));
   }*/

   /*public static void main(String[] args)
   {
      System.out.println("Hello ValidTicTacToe");

      ValidTicTacToe validTicTacToe = new ValidTicTacToe();

      String[] board = {"XOX"," X ","   "};

      System.out.println("Should be false: " + validTicTacToe.validTicTacToe(board));
   }*/

   public static void main(String[] args)
   {
      System.out.println("Hello ValidTicTacToe");

      ValidTicTacToe validTicTacToe = new ValidTicTacToe();

      String[] board = {"OXX","XOX","OXO"};

      System.out.println("Should be false: " + validTicTacToe.validTicTacToe(board));
   }



}
