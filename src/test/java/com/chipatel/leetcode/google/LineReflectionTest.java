/**
 * 
 */
package com.chipatel.leetcode.google;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class LineReflectionTest {
  LineReflection lr = new LineReflection();

  @Test
  public void testTrue() {
    int[][] points = {{1, 1}, {-1, 1}};
    Assert.assertTrue(lr.isReflection(points));
  }

  @Test
  public void testFail() {
    int[][] points = {{1, 1}, {-1, -1}};
    Assert.assertFalse(lr.isReflection(points));
  }

}
