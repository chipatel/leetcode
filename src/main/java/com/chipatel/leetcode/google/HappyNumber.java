/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HappyNumber {

  public boolean isHappyNumber(int n) {
    int x = n;
    int y = n;

    while (x > 1) {
      x = digitSquareSum(x);
      if (x == 1) {
        return true;
      }

      y = digitSquareSum(digitSquareSum(y));
      if (y == 1) {
        return true;
      }
      if (x == y) {
        return false;
      }
    }
    return true;
  }


  public int digitSquareSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += (n % 10) * (n % 10);
      n /= 10;
    }
    return sum;
  }

}
