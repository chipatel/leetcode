/**
 * 
 */
package com.chipatel.leetcode.square;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SquirrelSimulation {

  public int squirrelSteps(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
    int n = nuts.length;
    int[] nToT = new int[n];
    int[] nToS = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      nToT[i] = Math.abs(nuts[i][0] - tree[0]) + Math.abs(nuts[i][1] - tree[1]);
      sum += nToT[i] * 2;
      nToS[i] = Math.abs(nuts[i][0] - squirrel[0]) + Math.abs(nuts[i][1] - squirrel[1]);
    }


    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      int dist = sum + nToS[i] - nToT[i];
      min = Math.min(min, dist);
    }
    return min;
  }
}
