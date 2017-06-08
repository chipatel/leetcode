/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class RemoveInvalidParentheses {
  public List<String> removeInvalidParentheses(String s) {
    List<String> ans = new ArrayList<String>();
    remove(s, ans, 0, 0, new char[] {'(', ')'});
    return ans;
  }

  public void remove(String s, List<String> ans, int last_i, int last_j, char[] par) {
    for (int stack = 0, i = 0; i < s.length(); i++) {
      if (s.charAt(i) == par[0]) {
        stack++;
      }
      if (s.charAt(i) == par[1]) {
        stack--;
      }
      if (stack >= 0) {
        continue;
      }
      for (int j = last_j; j <= i; j++) {
        if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1])) {
          remove(s.substring(0, j) + s.substring(j + 1, s.length()), ans, i, j, par);
        }

      }
      return;
    }
    String reverse = new StringBuilder(s).reverse().toString();
    if (par[0] == '(') {
      remove(reverse, ans, 0, 0, new char[] {')', '('});
    } else {
      ans.add(reverse);
    }
  }
}
