/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.Stack;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 * 
 *         https://leetcode.com/problems/min-stack/#/description
 *
 */
public class MinStack {
  Stack<Integer> stack;;
  int min = Integer.MAX_VALUE;

  public MinStack() {
    stack = new Stack<Integer>();
  }

  public void push(int x) {
    if (x <= min) {
      stack.push(min);
      min = x;
    }
    stack.push(x);
  }

  public void pop() {
    if (stack.pop() == min) {
      min = stack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }

}
