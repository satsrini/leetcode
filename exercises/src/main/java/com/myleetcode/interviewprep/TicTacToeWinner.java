package com.myleetcode.interviewprep;

/**
 * <h1>TicTacToeWinner.java</h1>
 * This class implements TicTacToeWinner solution.
 * <p> TicTacToeWinner qn can be found in https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-14
 */

public class TicTacToeWinner
{
   public TicTacToeWinner(){}

   public String tictactoe(int[][] moves)
   {

      int[][] board = new int[3][3];

      int player = 1;
      int count = 0;

      for(int[] move:moves)
      {
         count++;
         board[move[0]][move[1]] = player;

         // check row
         if(board[move[0]][0] + board[move[0]][1] + board[move[0]][2] == 3*player)
         {
             return (player == 1) ? "A": "B";
         }

         // check column
         if(board[0][move[1]] + board[1][move[1]] + board[2][move[1]] == 3*player)
         {
             return (player == 1) ? "A": "B";
         }

         // check diagonal
         if(move[0] == move[1] && board[0][0] + board[1][1] + board[2][2] == 3*player)
         {
            return (player == 1) ? "A": "B";
         }


         // check anti diagonal
         if(move[0] == 2-move[1] && board[0][2] + board[1][1] + board[2][0] == 3*player)
         {
            return (player == 1) ? "A": "B";
         }

         

         player = -1*player;
      }

      if(count == 9)
      {
         return "Draw";
      }

      return "Pending";
   }


   public static void main(String[] args)
   {
      System.out.println("Hello TicTacToeWinner");

      TicTacToeWinner ticTacToeWinner = new TicTacToeWinner();
      int[][] moves = {{0,0}, {2,0}, {1,1}, {2,1}, {2,2}};

      System.out.println("Should be A:   " + ticTacToeWinner.tictactoe(moves));

   }


}
