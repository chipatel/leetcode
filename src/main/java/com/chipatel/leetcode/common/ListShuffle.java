/**
 * 
 */
package com.chipatel.leetcode.common;

import java.util.Random;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 * 
 *         https://leetcode.com/problems/shuffle-an-array/#/description
 * 
 *         Shuffle a set of numbers without duplicates.
 * 
 *         Example:
 * 
 *         // Init an array with set 1, 2, and 3. int[] nums = {1,2,3}; Solution solution = new
 *         Solution(nums);
 * 
 *         // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must
 *         equally likely to be returned. solution.shuffle();
 * 
 *         // Resets the array back to its original configuration [1,2,3]. solution.reset();
 * 
 *         // Returns the random shuffling of array [1,2,3]. solution.shuffle();
 *
 */

public class ListShuffle {
  public int[] nums;
  public Random rand;

  public ListShuffle(int[] nums) {
    this.nums = nums;
    rand = new Random();
  }

  /** Resets the array to its original configuration and return it. */
  public int[] reset() {
    return nums;
  }

  /** Returns a random shuffling of the array. */
  public int[] shuffle() {
    if (nums == null) {
      return null;
    }
    int a[] = nums.clone();
    for (int j = 1; j < a.length; j++) {
      int i = rand.nextInt(j + 1);
      swap(a, i, j);
    }
    return a;
  }

  public void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
}
