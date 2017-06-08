/**
 * 
 */
package com.chipatel.leetcode.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class TheSkylineProblem {

  public List<Edges> getSkyline(int[][] buildings) {
    List<Edges> tmp = new ArrayList<Edges>();
    if (buildings == null || buildings.length == 0 || buildings[0].length == 0) {
      return tmp;
    }
    for (int i = 0; i < buildings.length; i++) {
      tmp.add(new Edges(buildings[i][0], buildings[i][2]));
      tmp.add(new Edges(buildings[i][1], buildings[i][2]));
    }
    System.out.println(tmp.toString());
    Collections.sort(tmp, new Comparator<TheSkylineProblem.Edges>() {
      public int compare(Edges edge1, Edges edge2) {
        return edge1.x - edge2.x;
      }
    });
    int x = -1;
    int y = -1;

    List<Edges> res = new ArrayList<Edges>();
    for (int i = 0; i < tmp.size(); i++) {
      Edges e = tmp.get(i);
      if (e.x > x && e.y > y) {
        res.add(e);
        x = e.x;
        y = e.y;
      } else if (y > e.y && x < e.x) {
        y = e.y;
      }
      /*
       * if (tmp.get(i - 1).x < tmp.get(i).x && tmp.get(i - 1).y < tmp.get(i).y) {
       * res.add(tmp.get(i)); }
       */
    }

    System.out.println(tmp.toString());
    return res;
  }

  class Edges {
    int x;
    int y;

    Edges(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return x + "-" + y;
    }
  }
}

