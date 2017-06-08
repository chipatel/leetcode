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
public class TrappingRainWaterTest {
  TrappingRainWater trw = new TrappingRainWater();

  @Test
  public void test() {
    Assert.assertEquals(6, trw.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
  }

}
