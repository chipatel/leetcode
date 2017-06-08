/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.Arrays;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class WiggleSort {
  public int[] wiggleSortNot(int[] nums) {
    int len = nums.length;
    Arrays.sort(nums);
    int[] res = new int[len];
    int cnt = 0;
    for (int i = 0; i < len; i += 2) {
      res[i] = nums[cnt];
      res[i + 1] = nums[(len - 1) - cnt];
      cnt++;
    }
    System.out.println(Arrays.toString(res));
    return nums;
  }

  public void wiggleSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i % 2 == 1) {
        if (nums[i - 1] > nums[i]) {
          swap(nums, i);
        }
      } else if (i != 0 && nums[i - 1] < nums[i]) {
        swap(nums, i);
      }
    }
    System.out.println(Arrays.toString(nums));
  }

  public void swap(int[] nums, int i) {
    int tmp = nums[i];
    nums[i] = nums[i - 1];
    nums[i - 1] = tmp;
  }

}
