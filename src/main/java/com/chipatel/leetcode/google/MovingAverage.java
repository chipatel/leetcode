/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MovingAverage {
  private int[] frame;
  private int n, insert;
  private long sum;

  /** Initialize your data structure here. */
  public MovingAverage(int size) {
    frame = new int[size];
    // System.out.println(Arrays.toString(frame));
    insert = n = 0;
    sum = 0;
  }

  public double next(int val) {
    if (n < frame.length) {
      n++;
    }
    sum -= frame[insert];
    // System.out.println("sum-=...." + sum + "----" + insert + "-----" + frame[insert]);
    sum += val;

    frame[insert] = val;
    insert = (insert + 1) % frame.length;

    return (double) sum / n;
  }
}
