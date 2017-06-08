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
public class LongestSubStringWithAtMost2DistCharTest {
  LongestSubStringWithAtMost2DistChar lss = new LongestSubStringWithAtMost2DistChar();

  @Test
  public void test() {
    Assert.assertEquals(2, lss.lengthOfLogestSubStrTwoDist("eceba"));
  }

}
