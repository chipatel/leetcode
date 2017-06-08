/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */


/*
 * Brute force: 1. Only 26 letters are there in A~Z, so we can divide by column size and know where
 * are we -- Based on column size, we know what is size of our metric. 2. We are starting from 0 3.
 * Calculation should be based on current location and where we want to go. 4. What if we have
 * column size of 5, In last row there is only 'Z'. So for 'Z' we need to go to Left and all the way
 * down.
 */
public class HowToSearchMovie {
  public static void main(String[] args) {
    System.out.println(1 % 5);
    System.out.println(getPatternForMoiveName("UP", 5));
  }

  public static char[] A_TO_Z = new char[] {'A'};

  public static String getPatternForMoiveName(String movieName, int col) {
    StringBuilder sb = new StringBuilder();
    sb.append(helper(0, movieName.charAt(0) - 'A', col));
    for (int i = 1; i < movieName.length(); i++) {
      sb.append(helper(sb.toString().charAt(i - 1), movieName.charAt(i), col));
    }
    return sb.toString();
  }

  public static String helper(int start, int end, int col) {
    StringBuilder tmp = new StringBuilder();
    if (start == end) {
      tmp.append("!");
    }

    while (start != end) {
      // 0 -- 20
      if (start < end) {
        if (start % col != 0) {
          tmp.append("R");
          start--;
        }
        if (start % col == 0) {
          tmp.append("D");
          start += col;
        }
      }

      if (start > end) {
        if (start % col != 0) {
          tmp.append("L");
          start++;
        }
        if (start % col == 0) {
          tmp.append("U");
          start -= col;
        }
      }

      if (start == end) {
        tmp.append("!");
      }
    }

    return tmp.toString();
  }
}
