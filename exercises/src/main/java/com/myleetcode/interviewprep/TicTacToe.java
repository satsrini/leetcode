package com.myleetcode.interviewprep;

/**
 * <h1>TicTacToe.java</h1>
 * This class implements TicTacToe solution.
 * <p> TicTacToe qn can be found in https://leetcode.com/problems/design-tic-tac-toe/
 *
 *
 * @author  Satish Srinivasan
 * @version 1.0
 * @since   2022-08-12
 */


public class TicTacToe
{

  private int[][] board;
  private int n;

  public TicTacToe(int n)
  {
      this.n = n;
      board = new int[n][n];
  }

  public int move(int row, int col, int player)
  {

    board[row][col] = player;

    boolean win = true;
    // search the row
    for(int i = 0; i < n; i++)
    {
       if(board[row][i] != player)
       {
          win = false;
          break;
       }
    }

    if(win)
    {
       return player;
    }

    // search the column
    win = true;
    for(int i = 0; i < n; i++)
    {
       if(board[i][col] != player)
       {
          win = false;
          break;
       }
    }

    if(win)
    {
      return player;
    }

    // diagonal down
    if(row == col)
    {
       win = true;
       for(int i = 0; i < n; i++)
       {
         if(board[i][i] != player)
         {
            win = false;
            break;
         }
       }
    }

    if(win)
    {
       return player;
    }

    // diagonal up
    if(row == n-1-col)
    {
       win = true;
       for(int i = 0; i < n; i++)
       {
          if(board[i][n-1-i] != player)
          {
             win = false;
             break;
          }
       }

    }

    if(win)
    {
       return player;
    }

    return 0;
  }

  public static void main(String[] args)
  {
     System.out.println("Hello TicTacToe");

     TicTacToe ticTacToe = new TicTacToe(3);

     System.out.println("Shoould be 0:   " + ticTacToe.move(0,0,1));
     System.out.println("Shoould be 0:   " + ticTacToe.move(0,2,2));
     System.out.println("Shoould be 0:   " + ticTacToe.move(2,2,1));
     System.out.println("Shoould be 0:   " + ticTacToe.move(1,1,2));
     System.out.println("Shoould be 0:   " + ticTacToe.move(2,0,1));
     System.out.println("Shoould be 0:   " + ticTacToe.move(1,0,2));
     System.out.println("Shoould be 1, wins:   " + ticTacToe.move(2,1,1));

  }

}
