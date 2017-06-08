/**
 * 
 */
package com.chipatel.leetcode.google;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MinStackTest {

  @Test
  public void test() {
    MinStack ms = new MinStack();
    ms.push(-2);
    ms.push(0);
    ms.push(-3);
    Assert.assertEquals(ms.getMin(), -3);
    ms.pop();
    Assert.assertEquals(ms.top(), 0);
    Assert.assertEquals(ms.getMin(), -2);
  }
  // ["MinStack","push","push","push","top","pop","getMin","pop","getMin",
  // "pop","push","top","getMin","push","top","getMin","pop","getMin"]

  @Test
  public void testMaxInt() {
    MinStack ms = new MinStack();
    ms.push(2147483646);
    ms.push(2147483646);
    ms.push(2147483647);
    System.out.println(ms.top());
    ms.pop();
    // System.out.println(ms.pop());
    System.out.println(ms.getMin());
    ms.pop();
    System.out.println(ms.getMin());
    ms.pop();
    ms.push(2147483647);
    System.out.println(ms.top());
    System.out.println(ms.getMin());
    ms.push(-2147483648);
    System.out.println(ms.top());
    System.out.println(ms.getMin());
    ms.pop();
    System.out.println(ms.getMin());
    // Assert.assertEquals(ms.getMin(), -3);
    // ms.pop();
    // Assert.assertEquals(ms.top(), 0);
    // Assert.assertEquals(ms.getMin(), -2);
  }
  /*
   * 2147483647,null, 2147483646,null, 2147483646,null,null, 2147483647, 2147483647,null,
   * -2147483648, -2147483648,null, 2147483647
   * 
   */
}
