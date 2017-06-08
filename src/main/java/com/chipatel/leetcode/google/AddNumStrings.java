/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.Stack;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class AddNumStrings {
  /*
   * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
   * x) { val = x; } }
   */

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    while (l1 != null) {
      s1.push(l1.val);
    }

    while (l2 != null) {
      s2.push(l2.val);
    }

    int sum = 0;
    ListNode list = new ListNode(0);
    while (!s1.empty() || !s2.empty()) {
      if (!s1.empty()) {
        sum += s1.pop();
      }
      if (!s2.empty()) {
        sum += s2.pop();
      }

      list.val = sum % 10;
      ListNode head = new ListNode(sum / 10);
      head.next = list;
      list = head;
      sum /= 10;
    }
    return list.val == 0 ? list.next : list;
  }
}
