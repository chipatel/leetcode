/**
 * 
 */
package com.chipatel.leetcode.apple;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SolveSudokuWeb {
  public void solveSudoku(char[][] board) {
    if (board == null || board.length == 0)
      return;
    solve(board);
  }

  public boolean solve(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == '.') {
          for (char c = '1'; c <= '9'; c++) {// trial. Try 1 through 9
            if (isValid(board, i, j, c)) {
              board[i][j] = c; // Put c for this cell

              if (solve(board))
                return true; // If it's the solution return true
              else
                board[i][j] = '.'; // Otherwise go back
            }
          }

          return false;
        }
      }
    }
    return true;
  }

  private boolean isValid(char[][] board, int row, int col, char c) {
    for (int i = 0; i < 9; i++) {
      if (board[i][col] != '.' && board[i][col] == c)
        return false; // check row

      if (board[row][i] != '.' && board[row][i] == c)
        return false; // check column

      int cubeI = 3 * (row / 3) + i / 3;
      int cubeJ = 3 * (col / 3) + i % 3;
      if (board[cubeI][cubeJ] != '.' && board[cubeI][cubeJ] == c)
        return false; // check 3*3 block
    }
    return true;
  }
}
