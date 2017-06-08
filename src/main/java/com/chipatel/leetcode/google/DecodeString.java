/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.Stack;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class DecodeString {
  public String decodeString(String s) {
    String res = "";

    Stack<Integer> countStack = new Stack<Integer>();
    Stack<String> resStack = new Stack<String>();
    int index = 0;

    while (index < s.length()) {
      if (Character.isDigit(s.charAt(index))) {
        int count = 0;
        while (Character.isDigit(s.charAt(index))) {
          count = 10 * count + (s.charAt(index) - '0');
          index++;
        }
        countStack.push(count);
      } else if (s.charAt(index) == '[') {
        resStack.push(res);
        res = "";
        index++;
      } else if (s.charAt(index) == ']') {
        StringBuilder tmp = new StringBuilder(resStack.pop());
        int repeatTime = countStack.pop();
        for (int i = 0; i < repeatTime; i++) {
          tmp.append(res);
        }
        res = tmp.toString();
        index++;
      } else {
        res += s.charAt(index++);
      }
    }
    return res;
  }

}
