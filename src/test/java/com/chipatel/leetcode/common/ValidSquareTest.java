/**
 * 
 */
package com.chipatel.leetcode.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ValidSquareTest {

  @Test
  public void test() {
    ValidSquare vs = new ValidSquare();
    int[] p1 = {0, 0};
    int[] p2 = {1, 1};
    int[] p3 = {1, 0};
    int[] p4 = {0, 1};
    Assert.assertTrue("Not valid square", vs.validSquare(p1, p2, p3, p4));
  }

}
