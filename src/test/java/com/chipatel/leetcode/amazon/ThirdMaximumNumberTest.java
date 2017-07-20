/**
 * 
 */
package com.chipatel.leetcode.amazon;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ThirdMaximumNumberTest {

  ThirdMaximumNumber tmn = new ThirdMaximumNumber();

  @Test
  public void testOne() {
    int[] nums = {3, 2, 1};
    Assert.assertEquals(1, tmn.thirdMax(nums));
  }

  @Test
  public void testTwo() {
    int[] nums = {1, 2};
    Assert.assertEquals(2, tmn.thirdMax(nums));
  }

  @Test
  public void testThree() {
    int[] nums = {2, 2, 3, 1};
    Assert.assertEquals(1, tmn.thirdMax(nums));
  }

}
