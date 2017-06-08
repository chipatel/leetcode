/**
 * 
 */
package com.chipatel.leetcode.apple;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class CompareVersionNumbersTest {
  CompareVersionNumbers cvn = new CompareVersionNumbers();

  @Test
  public void testV1GreaterV2() {
    Assert.assertEquals("Not passed", 1, cvn.compareVersion("1.1", "0.2"));
  }

  @Test
  public void testV1LessV2() {
    Assert.assertEquals("Not passed", -1, cvn.compareVersion("0.1", "0.2"));
  }

  @Test
  public void testV1EqualsV2() {
    Assert.assertEquals("Not passed", 0, cvn.compareVersion("1.1", "1.1"));
  }

}
