/**
 * 
 */
package com.chipatel.leetcode.apple;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class CompareVersionNumbers {
  public int compareVersion(String version1, String version2) {
    String[] level1 = version1.split("\\.");
    String[] level2 = version2.split("\\.");

    int len = Math.max(level1.length, level2.length);
    for (int i = 0; i < len; i++) {
      Integer v1 = i < level1.length ? Integer.parseInt(level1[i]) : 0;
      Integer v2 = i < level2.length ? Integer.parseInt(level2[i]) : 0;
      int cmp = v1.compareTo(v2);
      if (cmp != 0) {
        return cmp;
      }
    }
    return 0;
  }

}
