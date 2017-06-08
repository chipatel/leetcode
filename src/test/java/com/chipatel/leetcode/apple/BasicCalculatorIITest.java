/**
 * 
 */
package com.chipatel.leetcode.apple;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class BasicCalculatorIITest {
  BasicCalculatorII calc = new BasicCalculatorII();

  @Test
  public void testOne() {
    Assert.assertEquals(7, calc.calculat("3+2*2"));
  }

  @Test
  public void testTwo() {
    Assert.assertEquals(1, calc.calculat(" 3/2 "));
  }

  @Test
  public void testTree() {
    Assert.assertEquals(5, calc.calculat("3+5 /2 "));
  }

}
