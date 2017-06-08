/**
 * 
 */
package com.chipatel.leetcode.common;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class CourceScheduleTest {

  @Test
  public void test() {
    CourceSchedule cs = new CourceSchedule();
    int[][] prerequisites = new int[][] {{1, 0}};
    int numCourses = 2;
    Assert.assertTrue("it is impossible", cs.canFinish(numCourses, prerequisites));
  }

}
