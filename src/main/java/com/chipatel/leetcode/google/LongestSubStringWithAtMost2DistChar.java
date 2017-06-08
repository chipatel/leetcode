/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class LongestSubStringWithAtMost2DistChar {


  public int lengthOfLogestSubStrTwoDist(String s) {
    if (s == null || s.isEmpty() || s.length() == 0) {
      return 0;
    }

    int i = 0;
    int j = -1;
    int max = 0;

    for (int k = 1; k < s.length(); k++) {
      if (s.charAt(k) == s.charAt(k - 1)) {
        continue;
      }

      if (j > -1 && s.charAt(k) != s.charAt(k - 1)) {
        max = Math.max(max, k - i);
        i = j + 1;
      }
      j = k - 1;
    }
    return max > (s.length() - i) ? max : (s.length() - i);
  }


  public int longestSubString2DistChar(String s) {
    if (s == null || s.isEmpty() || s.length() == 0) {
      return 0;
    }

    int max = 0;
    int count = 0;
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for (int i = 0, j = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (map.containsKey(ch) && count < 2) {
        j = Math.max(j, map.get(ch) + 1);
        count++;
      }
      map.put(ch, i);
      max = Math.max(max, i - j + 1);
    }
    return max;
  }

}
