/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class NQueenProblem {
  static class Position {
    int row, col;

    Position(int row, int col) {
      this.row = row;
      this.col = col;
    }

    @Override
    public String toString() {
      return row + " " + col;
    }
  }

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<List<String>>();
    Position[] positions = new Position[n];
    solve(0, positions, result, n);
    return result;
  }

  public void solve(int current, Position[] positions, List<List<String>> result, int n) {
    if (n == current) {
      StringBuffer buff = new StringBuffer();
      List<String> oneResult = new ArrayList<String>();
      for (Position p : positions) {
        for (int i = 0; i < n; i++) {
          if (p.col == i) {
            buff.append("Q");
          } else {
            buff.append(".");
          }
        }
        oneResult.add(buff.toString());
        buff = new StringBuffer();

      }
      result.add(oneResult);
      return;
    }

    for (int i = 0; i < n; i++) {
      boolean foundSafe = true;
      for (int j = 0; j < current; j++) {
        if (positions[j].col == i || positions[j].col - positions[j].row == i - current
            || positions[j].row + positions[j].col == i + current) {
          foundSafe = false;
          break;
        }
      }
      if (foundSafe) {
        positions[current] = new Position(current, i);
        solve(current + 1, positions, result, n);
      }
    }
  }

  public static void main(String args[]) {
    NQueenProblem s = new NQueenProblem();
    // Position[] positions = s.solveNQueenOneSolution(6);
    System.out.println(s.solveNQueens(4).toString());
    // Arrays.stream(s.solveNQueens(4))
    // .forEach(position -> System.out.println(position.row + " " + position.col));
  }


}
