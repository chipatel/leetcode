/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class UtilClassRun {
  public static void main(String[] args) {
    MovingAverage mvAvg = new MovingAverage(3);
    System.out.println(mvAvg.next(1));
    System.out.println(mvAvg.next(10));
    System.out.println(mvAvg.next(3));
    System.out.println(mvAvg.next(5));
  }

}
