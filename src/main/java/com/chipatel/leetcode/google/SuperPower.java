/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SuperPower {

  public int superPow(int a, int[] b) {
    int pw = 0;
    if (b.length == 0) {
      pw = b[0];
    }

    for (int i = 0; i < b.length; i++) {
      pw = 10 * pw + b[i];
    }
    return (int) Math.pow(a, pw);
  }

}
