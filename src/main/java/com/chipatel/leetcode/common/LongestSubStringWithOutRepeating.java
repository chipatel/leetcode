/**
 * 
 */
package com.chipatel.leetcode.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class LongestSubStringWithOutRepeating {

  public int longestSubString(String s) {
    if (s == null || s.isEmpty() || s.length() == 0) {
      return 0;
    }

    int max = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0, j = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (map.containsKey(ch)) {
        j = Math.max(j, map.get(ch) + 1);
      }
      map.put(ch, i);
      max = Math.max(max, i - j + 1);
    }
    return max;
  }

}
