/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HrHandAndMinHand {
  public double degreeBetweenHrHandAndMinHand(int hr, int min) {
    // With respect to O/12 hrs
    double minuterHandDegree = 6.0;
    double hourHandDegree = 30.0;
    double eachMinuteOfHr = 0.5;

    if (hr == 0 || hr == 12) {
      return min * minuterHandDegree;
    }

    if (min == 0 || min == 60) {
      return hr * hourHandDegree;
    }
    return ((hr * hourHandDegree) + (min * eachMinuteOfHr)) + (360 - (min * minuterHandDegree));
  }
}
