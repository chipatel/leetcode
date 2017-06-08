/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class UIEInterviewReOrderArrayTest {
  UIEInterviewReOrderArray swapAry = new UIEInterviewReOrderArray();

  @Test
  public void testOne() {
    char[] A = {'E', 'A', 'B', 'D', 'C'};
    int[] O = {4, 0, 1, 3, 2};
    swapAry.reorderBasedOnAnotherArray(A, O);
    System.out.println(Arrays.toString(A) + "\n----\n");
  }


  @Test
  public void testTwo() {
    char[] A = {'E', 'C', 'B', 'D', 'A'};
    int[] O = {4, 2, 1, 3, 0};
    swapAry.reorderBasedOnAnotherArray(A, O);
    System.out.println(Arrays.toString(A));
  }

}
