/**
 * 
 */
package com.chipatel.leetcode.common;

import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class TheSkylineProblemTest {
  TheSkylineProblem tsp = new TheSkylineProblem();

  @Test
  public void test() {
    int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};

    System.out.println(tsp.getSkyline(buildings).toString());
  }

}
