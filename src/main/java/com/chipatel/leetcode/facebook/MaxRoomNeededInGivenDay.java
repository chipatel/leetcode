/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MaxRoomNeededInGivenDay {

  class MeetingStartEndTime implements Comparable<MeetingStartEndTime> {
    int start;
    int end;

    public MeetingStartEndTime(int start, int end) {
      this.start = start;
      this.end = end;
    }

    @Override
    public int compareTo(MeetingStartEndTime o) {
      return this.start - o.start;
    }

    @Override
    public String toString() {
      return "s-" + start + "\te-" + end;
    }
  }


  public int maxRoomNeeded(int[][] intervals) {
    int rooms = 1;
    int res = Integer.MIN_VALUE;
    List<MeetingStartEndTime> tmp = new ArrayList<MeetingStartEndTime>();
    System.out.println(intervals.length);
    for (int i = 0; i < intervals.length; i++) {
      tmp.add(new MeetingStartEndTime(intervals[i][0], intervals[i][1]));
    }
    System.out.println(tmp.toString());
    Collections.sort(tmp);
    System.out.println(tmp.toString());

    int s = tmp.get(0).start;
    int e = tmp.get(0).end;

    for (int i = 1; i < tmp.size(); i++) {
      if (tmp.get(i).start > s && tmp.get(i).end <= e) {
        rooms++;
      }

      if (tmp.get(i).start > s && tmp.get(i).end > e) {
        s = tmp.get(i).start;
        e = tmp.get(i).end;
        rooms = 1;
      }
      res = Math.max(rooms, res);
    }
    return rooms;
  }

}
