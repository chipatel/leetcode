/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ConvexPolygon {
  public boolean isConvex(List<List<Integer>> points) {
    boolean gotPositive = false;
    boolean gotNegative = false;
    int lenPoints = points.size();

    int B, C;

    for (int A = 0; A < lenPoints; A++) {
      B = (A + 1) % lenPoints;
      C = (B + 1) % lenPoints;

      int crossPoint = crossProductOfABC(points.get(A).get(0), points.get(A).get(1),
          points.get(B).get(0), points.get(B).get(1), points.get(C).get(0), points.get(C).get(1));
      if (crossPoint > 0) {
        gotPositive = true;
      } else if (crossPoint < 0) {
        gotNegative = true;
      }

      if (gotPositive && gotNegative) {
        return false;
      }
    }
    return true;
  }

  public int crossProductOfABC(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
    int BAx = Ax - Bx;
    int BAy = Ay - By;
    int BCx = Cx - Bx;
    int BCy = Cy - By;

    return ((BAx * BCy) - (BAy * BCx));
  }


  public boolean isConvex1(List<List<Integer>> points) {
    int flag = 0;
    int B, C;
    int lenPts = points.size();
    for (int A = 0; A < lenPts; A++) {
      B = (A + 1) % lenPts;
      C = (B + 1) % lenPts;

      int angle = crossProductOfABC(points.get(A).get(0), points.get(A).get(1),
          points.get(B).get(0), points.get(B).get(1), points.get(C).get(0), points.get(C).get(1));

      if (angle == 0) {
        continue;
      }

      if (flag == 0) {
        flag = angle > 0 ? 1 : -1;
      } else if (flag > 0 != angle > 0) {
        return false;
      }
    }
    return true;
  }
}
