/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ListNode {

  public int val;
  public ListNode next;

  public ListNode(int x) {
    val = x;
  }


  public void setNext(ListNode next) {
    this.next = next;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(val);
    builder.append("->");
    builder.append(next);
    return builder.toString();
  }
}
