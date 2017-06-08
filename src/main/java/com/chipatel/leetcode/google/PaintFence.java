/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class PaintFence {
  public static void main(String[] args) {
    System.out.println(numWays(6, 3));
  }

  public static int numWays(int n, int k) {
    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return k;
    }

    int diffColor = k * (k - 1);
    int sameColor = k;
    System.out.println("diff:- " + diffColor + "\t" + "same:- " + sameColor);
    for (int i = 2; i < n; i++) {
      int tmp = diffColor;
      diffColor = (diffColor + sameColor) * (k - 1);
      sameColor = tmp;
      System.out.println("diff:- " + diffColor + "\t" + "same:- " + sameColor);
    }
    return diffColor + sameColor;
  }

}
