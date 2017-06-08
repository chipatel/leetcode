/**
 * 
 */
package com.chipatel.leetcode.apple;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SolveSudoku {

  public void solveSudoku(char[][] board) {
    if (board == null || board.length == 0 || board[0].length == 0) {
      return;
    }
    solve(board);
  }

  public boolean solve(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == '.') {
          for (char c = '1'; c <= '9'; c++) {
            if (isValidSudoku(board, i, j, c)) {
              board[i][j] = c;

              if (solve(board)) {
                return true;
              } else {
                board[i][j] = '.';
              }
            }
          }
          return false;
        }
      }
    }
    return true;
  }



  public boolean isValidSudoku(char[][] board, int i, int j, char ch) {
    if (board[i][j] != '.' && board[i][j] == ch) {
      return false;
    }

    if (board[j][i] != '.' && board[j][i] == ch) {
      return false;
    }

    int cubeI = 3 * (i / 3) + (j / 3);
    int cubeJ = 3 * (i % 3) + (j % 3);
    if (board[cubeI][cubeJ] != '.' && board[cubeI][cubeJ] == ch) {
      return false;
    }
    return true;
  }

}
