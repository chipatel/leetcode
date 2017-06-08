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
public class LongestSubStringWithOutRepeatingTest {
  LongestSubStringWithOutRepeating lss = new LongestSubStringWithOutRepeating();

  @Test
  public void testABCABCBB() {
    Assert.assertEquals(3, lss.longestSubString("abcabcbb"));
  }

  @Test
  public void testBBBBBB() {
    Assert.assertEquals(1, lss.longestSubString("bbbbb"));
  }

  @Test
  public void testPWWKEW() {
    Assert.assertEquals(3, lss.longestSubString("pwwkew"));
  }

}
