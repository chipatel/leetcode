/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SumOfTwoIntBitWise {
  public static void main(String[] args) {
    // System.out.println(bitwiseAdd(10, 2));
  }

  public static int bitwiseAdd(int x, int y) {
    while (y != 0) {
      int carry = x & y;
      x = x ^ y;
      y = carry << 1;
    }
    return x;

  }

}
