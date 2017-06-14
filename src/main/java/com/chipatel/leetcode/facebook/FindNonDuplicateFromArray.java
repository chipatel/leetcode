/**
 * 
 */
package com.chipatel.leetcode.facebook;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class FindNonDuplicateFromArray {

  public int signgleNumber(int[] a) {
    int singleNum = 0;
    for (int i = 0; i < a.length; i++) {
      singleNum = singleNum ^ a[i];
      System.out.println(singleNum);
    }
    return singleNum;
  }

}
