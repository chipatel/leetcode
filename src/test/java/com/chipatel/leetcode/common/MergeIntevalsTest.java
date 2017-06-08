/**
 * 
 */
package com.chipatel.leetcode.common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MergeIntevalsTest {
  MergeIntevals mi = new MergeIntevals();

  @Test
  public void test() {
    MergeIntevals.Interval i1 = new MergeIntevals.Interval(1, 3);
    MergeIntevals.Interval i2 = new MergeIntevals.Interval(2, 6);
    MergeIntevals.Interval i3 = new MergeIntevals.Interval(8, 10);
    MergeIntevals.Interval i4 = new MergeIntevals.Interval(15, 18);
    List<MergeIntevals.Interval> intervals = new ArrayList<MergeIntevals.Interval>();
    intervals.add(i1);
    intervals.add(i2);
    intervals.add(i3);
    intervals.add(i4);

    System.out.println(mi.merge(intervals).toString());

  }

}
