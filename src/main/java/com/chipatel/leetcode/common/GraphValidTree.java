/**
 * 
 */
package com.chipatel.leetcode.common;

import java.util.Arrays;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 * 
 *         https://leetcode.com/problems/graph-valid-tree/#/description
 *
 */
public class GraphValidTree {
  public boolean validTree(int n, int[][] edges) {
    // init n isolated islands
    int[] nums = new int[n];
    Arrays.fill(nums, -1);

    for (int i = 0; i < edges.length; i++) {
      int x = find(nums, edges[i][0]);
      int y = find(nums, edges[i][1]);
      System.out.println("For i:- " + i + "\tx:- " + x + "\ty:- " + y);
      if (x == y) {
        return false;
      }
      nums[x] = y;
    }
    return edges.length == (n - 1);
  }

  public int find(int[] nums, int i) {
    if (nums[i] == -1) {
      return i;
    }
    return find(nums, nums[i]);
  }

}
