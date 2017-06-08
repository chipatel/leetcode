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
public class GraphValidTreeTest {

  @Test
  public void testValidTree() {
    GraphValidTree gvt = new GraphValidTree();
    int[][] edges = new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
    int n = 5;
    Assert.assertTrue("Condition not passed !!!", gvt.validTree(n, edges));
  }

  @Test
  public void testNonValid() {
    GraphValidTree gvt = new GraphValidTree();
    int[][] edges = new int[][] {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
    int n = 5;
    System.out.println("------------------------");
    Assert.assertFalse("Condition not passed !!!", gvt.validTree(n, edges));
  }

}
