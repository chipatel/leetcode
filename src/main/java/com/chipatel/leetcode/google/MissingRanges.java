/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 * 
 *         https://leetcode.com/problems/missing-ranges/#/description
 *
 */
public class MissingRanges {
  public static void main(String[] args) {
    System.out.println(findMissingRanges(new int[] {2147483647}, 0, 2147483647));
    System.out.println(findMissingRanges(null, 1, 1));
    System.out.println(findMissingRanges(new int[] {-1}, -1, 0));
    System.out.println(findMissingRanges(new int[] {5, 8, 11}, 0, 99));
  }

  public static List<String> findMissingRanges(int[] a, int lo, int hi) {
    List<String> res = new ArrayList<String>();
    if (a == null || a.length == 0) {
      res.add(getMissingRange(lo, hi));
      return res;
    }

    int next = lo;

    for (int i = 0; i < a.length; i++) {
      if (a[i] < next)
        continue;

      if (a[i] == next) {
        next++;
        continue;
      }

      res.add(getMissingRange(next, a[i] - 1));

      next = a[i] + 1;
    }

    if (next <= hi && a.length > 1) {
      res.add(getMissingRange(next, hi));
    }

    return res;
  }

  public static String getMissingRange(int n1, int n2) {
    if (n1 == n2) {
      return String.valueOf(n1);
    }
    return String.format("%d->%d", n1, n2);
  }
}



/*
 * int len = nums.length; List<String> res = new ArrayList<String>(); int index = 0; for (int i = 0;
 * i < len - 1; i++) { System.out.println(nums[index] > lower); if (nums[index] > lower && index ==
 * 0) { if (nums[index] - 1 == lower) { res.add(lower + ""); } else { res.add(lower + "->" +
 * (nums[index] - 1)); } } if (nums[index] < upper && index == len - 1) {
 * System.out.println("upper...."); if (nums[index] + 1 == upper) { res.add(upper + ""); } else {
 * res.add(nums[index] + 1 + "->" + upper); } } if (nums[index + 1] - nums[index] == 0) {
 * System.out.println("----"); continue; } else if (nums[index + 1] - nums[index] == 2) {
 * res.add((nums[index] + 1) + ""); } else { res.add((nums[index] + 1) + "->" + (nums[index + 1] -
 * 1)); } index++; } return res; }
 */
