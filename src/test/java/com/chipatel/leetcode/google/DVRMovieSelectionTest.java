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
public class DVRMovieSelectionTest {
  DVRMovieSelection dvrSelection = new DVRMovieSelection();

  @Test
  public void test() {
    Assert.assertEquals("DD!RDDDD!", dvrSelection.dvrMoiveSelection("IZ", 4));
  }

  @Test
  public void testUPmovie() {
    Assert.assertEquals("DDDD!U!", dvrSelection.dvrMoiveSelection("UP", 5));
  }

  @Test
  public void testlowercaseUPmovie() {
    Assert.assertEquals("DDDD!U!", dvrSelection.dvrMoiveSelection("up", 5));
  }

}
