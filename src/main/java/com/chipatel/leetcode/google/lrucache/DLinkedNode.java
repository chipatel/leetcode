/**
 * 
 */
package com.chipatel.leetcode.google.lrucache;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class DLinkedNode {
  int key;
  int value;
  DLinkedNode pre;
  DLinkedNode post;

  @Override
  public String toString() {
    return key + "-" + value;
  }
}
