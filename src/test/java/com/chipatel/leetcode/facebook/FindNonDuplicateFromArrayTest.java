/**
 * 
 */
package com.chipatel.leetcode.facebook;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class FindNonDuplicateFromArrayTest {

  @Test
  public void test() {
    FindNonDuplicateFromArray fnond = new FindNonDuplicateFromArray();
    Assert.assertEquals(3, fnond.signgleNumber(new int[] {1, 2, 2, 3, 1}));
  }

}
