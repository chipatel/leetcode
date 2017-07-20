/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class MaxRoomNeededInGivenDayTest {

  @Test
  public void test() {
    int[][] intervals = {{10, 12}, {11, 12}, {1, 3}, {4, 5}, {2, 3}, {6, 7}};

    MaxRoomNeededInGivenDay mrnigd = new MaxRoomNeededInGivenDay();

    System.out.println(Arrays.toString(intervals));
    System.out.println(mrnigd.maxRoomNeeded(intervals));
  }

}
