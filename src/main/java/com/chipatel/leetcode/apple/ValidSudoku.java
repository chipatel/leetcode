/**
 * 
 */
package com.chipatel.leetcode.apple;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ValidSudoku {
  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      Set<Character> row = new HashSet<Character>();
      Set<Character> col = new HashSet<Character>();
      Set<Character> cube = new HashSet<Character>();

      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.' && !row.add(board[i][j])) {
          return false;
        }

        if (board[j][i] != '.' && !col.add(board[j][i])) {
          return false;
        }

        int cubeI = 3 * (i / 3) + (j / 3);
        int cubeJ = 3 * (i % 3) + (j % 3);
        if (board[cubeI][cubeJ] != '.' && !cube.add(board[cubeI][cubeJ])) {
          return false;
        }
      }
    }
    return true;
  }
}
