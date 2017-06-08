/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class RemoveInvalidParenthesesTest {

  @Test
  public void test() {
    RemoveInvalidParentheses rip = new RemoveInvalidParentheses();
    Assert.assertEquals(new ArrayList<String>(Arrays.asList("(())", "()()")),
        rip.removeInvalidParentheses("(()(()"));

    Assert.assertEquals(new ArrayList<String>(Arrays.asList("")),
        rip.removeInvalidParentheses(")("));

    Assert.assertEquals(new ArrayList<String>(Arrays.asList("(())()", "()()()")),
        rip.removeInvalidParentheses("()())()"));

    Assert.assertEquals(new ArrayList<String>(Arrays.asList("(a())()", "(a)()()")),
        rip.removeInvalidParentheses("(a)())()"));
  }

}
