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
public class WiggleSortTest {

  @Test
  public void test() {
    WiggleSort ws = new WiggleSort();
    Assert.assertArrayEquals(new int[] {3, 5, 1, 6, 2, 4},
        ws.wiggleSort(new int[] {3, 5, 2, 1, 6, 4}));
  }
}
