/**
 * 
 */
package com.chipatel.leetcode.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MergeIntevals {

  public List<Interval> merge(List<Interval> intervals) {
    List<Interval> res = new ArrayList<Interval>();

    if (intervals.size() == 0 || intervals == null) {
      return res;
    }

    if (intervals.size() == 1) {
      return intervals;
    }

    Interval curr = intervals.get(0);
    for (int i = 1; i < intervals.size(); i++) {
      Interval next = intervals.get(i);
      if (curr.end >= next.start && curr.end >= next.end) {
        res.add(curr);
      } else if (curr.end >= next.start && curr.end <= next.end) {
        next.start = curr.start;
        res.add(next);
      } else {
        res.add(next);
      }
      curr = next;
    }
    return res;
  }


  static class Interval {
    int start;
    int end;

    Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }

    @Override
    public String toString() {
      return start + "-" + end;
    }
  }

}
