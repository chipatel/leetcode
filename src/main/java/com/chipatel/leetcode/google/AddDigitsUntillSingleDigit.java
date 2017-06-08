/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class AddDigitsUntillSingleDigit {

  public int addDigits(int num) {
    while (num / 10 > 0) {
      num = getDigitSum(num);
    }
    return num;
  }

  public int getDigitSum(int n) {
    int sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }

}
