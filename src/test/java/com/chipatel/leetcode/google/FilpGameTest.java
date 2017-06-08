/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class FilpGameTest extends TestCase {
  FlipGame fg = new FlipGame();

  @Test
  public void testOne() {
    List<String> res = new ArrayList<String>();
    res.add("--++");
    res.add("+--+");
    res.add("++--");
    Assert.assertEquals(res, fg.generatePossibleNextMoves("++++"));
  }


}
