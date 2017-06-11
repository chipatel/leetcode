/**
 * 
 */
package com.chipatel.leetcode.apple;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ReverseWordsInString {

  public String reverseWords(String str) {
    if (str == null) {
      return null;
    }

    if (str.isEmpty()) {
      return "";
    }

    StringBuffer sb = new StringBuffer();
    str = str.trim();
    for (int i = 0; i < str.length(); i++) {

    }
    return sb.toString().trim();
  }
}
