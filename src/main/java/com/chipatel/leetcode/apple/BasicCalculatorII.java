/**
 * 
 */
package com.chipatel.leetcode.apple;

import java.util.Stack;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *         https://leetcode.com/problems/basic-calculator-ii/#/description
 *
 */
public class BasicCalculatorII {

  public int calculat(String s) {
    int number = 0;
    int result = 0;

    if (s == null || s.isEmpty()) {
      return result;
    }
    char sign = '+';
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        number = 10 * number + (c - '0');
      }
      if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
        if (sign == '+') {
          stack.push(number);
        }
        if (sign == '-') {
          stack.push(-number);
        }
        if (sign == '*') {
          stack.push(stack.pop() * number);
        }
        if (sign == '/') {
          stack.push(stack.pop() / number);
        }
        sign = c;
        number = 0;
      }
    }

    for (int i : stack) {
      result += i;
    }
    return result;
  }


  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int div(int a, int b) {
    return a / b;
  }

  public int mul(int a, int b) {
    return a * b;
  }
}
