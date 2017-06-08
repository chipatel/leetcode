/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class LineReflection {
  public boolean isReflection(int[][] points) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    Set<String> set = new HashSet<String>();

    for (int[] p : points) {
      max = Math.max(max, p[0]);
      min = Math.min(min, p[0]);

      System.out.println(min + " <--> " + max);

      String str = p[0] + "##" + p[1];
      set.add(str);
    }

    int sum = max + min;
    for (int[] p : points) {
      String str = (sum - p[0]) + "##" + p[1];
      if (!set.contains(str)) {
        return false;
      }
    }
    return true;
  }

}
