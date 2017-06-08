/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class FlipGame {
  public List<String> generatePossibleNextMoves(String s) {
    List<String> list = new ArrayList<String>();
    for (int i = -1; (i = s.indexOf("++", i + 1)) >= 0;) {
      list.add(s.substring(0, i) + "--" + s.substring(i + 2));
    }
    return list;
  }

}
