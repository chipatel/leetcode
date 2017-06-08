/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.Arrays;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class UIEInterviewReOrderArray {

  public void reorderBasedOnAnotherArray(char[] A, int[] O) {
    int lenO = O.length;
    int iO = 0; // Index of O

    while (iO < lenO) {
      int nwIdx = O[iO];
      if (iO == nwIdx) {
        iO++;
      } else {
        swapChar(A, iO, nwIdx);
        swapInt(O, iO, nwIdx);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(O));
        System.out.println("----------------");
      }
    }
  }

  public void swapChar(char[] objArr, int swapA, int swapB) {
    char tmp = objArr[swapA];
    objArr[swapA] = objArr[swapB];
    objArr[swapB] = tmp;
  }

  public void swapInt(int[] objArr, int swapA, int swapB) {
    int tmp = objArr[swapA];
    objArr[swapA] = objArr[swapB];
    objArr[swapB] = tmp;
  }

}
