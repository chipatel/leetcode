/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class TrappingRainWater {

  public int trap(int[] height) {
    int left = 0;
    int leftMax = 0;
    int right = height.length - 1;
    int rightMax = 0;

    int max = 0;
    // System.out.println("left-h[left]-lMax-right-h[right]-rMax==> max");
    while (left <= right) {
      leftMax = Math.max(leftMax, height[left]);
      rightMax = Math.max(rightMax, height[right]);

      if (leftMax < rightMax) {
        max += (leftMax - height[left]);
        left++;
      } else {
        max += (rightMax - height[right]);
        right--;
      }
      // System.out.println(left + "-" + height[left] + "-" + leftMax + "-" + right + "-"
      // + height[right] + "-" + rightMax + "==>" + max);
    }
    return max;
  }

}
