/**
 * 
 */
package com.chipatel.leetcode.apple;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MaximalSquare {
  public int maximalSquare(char[][] matrix) {
    if (matrix.length == 0 || matrix == null || matrix[0].length == 0) {
      return 0;
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int result = 0;
    int[][] matrixB = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (matrix[i - 1][j - 1] == '1') {
          matrixB[i][j] =
              Math.min(Math.min(matrixB[i][j - 1], matrixB[i - 1][j]), matrixB[i - 1][j - 1]) + 1;
          result = Math.max(matrixB[i][j], result);
        }
      }
    }
    return result * result;
  }

}
