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
public class BasicCalculatorTest {
  BasicCalculator calc = new BasicCalculator();

  @Test
  public void testOnePlusOne() {
    Assert.assertEquals(2, calc.calculate("1 + 1"));
  }

  /*
   * 2-1 + 2 = 3
   */
  @Test
  public void testTwoMinusOnePlusTwo() {
    Assert.assertEquals(3, calc.calculate("2-1 + 2"));
  }


  @Test
  public void testLongOne() {
    Assert.assertEquals(23, calc.calculate("(1+(4+5+2)-3)+(6+8)"));
  }

}
