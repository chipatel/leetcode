/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.Stack;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class BasicCalculator {

  public int calculate(String s) {
    Stack<Integer> stack = new Stack<Integer>();
    int result = 0;
    int number = 0;
    int sign = 1;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        number = 10 * number + (c - '0');
      } else if (c == '+') {
        result += sign * number;
        number = 0;
        sign = 1;
      } else if (c == '-') {
        result += sign * number;
        number = 0;
        sign = -1;
      } else if (c == '(') {
        // we push result 1st and sign
        stack.push(result);
        stack.push(sign);

        // reset number and sign
        sign = 1;
        result = 0;
      } else if (c == ')') {
        result += sign * number;
        number = 0;
        result *= stack.pop();// sign 1st
        result += stack.pop();// result
      }

    }
    if (number != 0) {
      result += sign * number;
    }
    return result;

  }


}
