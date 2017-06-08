/**
 * 
 */
package com.chipatel.leetcode.google_facebook;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ExpressionAddOperatorsTest {
  ExpressionAddOperators eao = new ExpressionAddOperators();

  @Test
  public void test() {
    Assert.assertEquals(Arrays.asList(new String[] {"1+2+3", "1*2*3"}), eao.addOperators("123", 6));
  }

}
