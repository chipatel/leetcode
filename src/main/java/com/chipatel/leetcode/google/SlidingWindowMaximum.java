/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SlidingWindowMaximum {

  public int[] maxSlidingWindow(int[] nums, int k) {
    int len = nums.length;

    if (nums == null || len == 0) {
      return null;
    }

    int[] res = new int[(len - k) + 1];
    for (int i = 0; i < len - k + 1; i++) {
      int maxVal = Integer.MIN_VALUE;
      for (int j = i; j < k + i; j++) {
        maxVal = getMaxVal(maxVal, nums[j]);
      }
      res[i] = maxVal;
    }
    return res;
  }

  public int getMaxVal(int maxVal, int comp) {
    return maxVal <= comp ? comp : maxVal;
  }
}
