/**
 * 
 */
package com.chipatel.leetcode.facebook;

import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class TextJustificationTest {

  @Test
  public void test() {
    TextJustification tjf = new TextJustification();
    String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth = 16;
    System.out.println(tjf.fullJustify(words, maxWidth).toString());
  }

}
