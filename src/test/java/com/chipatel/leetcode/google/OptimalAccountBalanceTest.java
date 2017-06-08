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
public class OptimalAccountBalanceTest {
  OptimalAccountBalance oab = new OptimalAccountBalance();

  @Test
  public void testOne() {
    int[][] transactions = {{0, 1, 10}, {1, 0, 1}, {1, 2, 5}, {2, 0, 5}};
    Assert.assertEquals(1, oab.minTransfers(transactions));
  }

  @Test
  public void testTwo() {
    int[][] transactions = {{1, 2, 3}, {2, 3, 5}, {4, 1, 6}};
    Assert.assertEquals(2, oab.minTransfers(transactions));
  }

}
