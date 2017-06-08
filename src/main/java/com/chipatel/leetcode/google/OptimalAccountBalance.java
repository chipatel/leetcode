/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class OptimalAccountBalance {

  public int minTransfers(int[][] transactions) {
    if (transactions == null || transactions.length == 0) {
      return 0;
    }

    Map<Integer, Integer> account = new HashMap<Integer, Integer>();
    for (int i = 0; i < transactions.length; i++) {
      int person1 = transactions[i][0];
      int person2 = transactions[i][1];
      int money = transactions[i][2];

      account.put(person1, account.getOrDefault(person1, 0) + money);
      account.put(person2, account.getOrDefault(person2, 0) - money);
    }

    List<Integer> neg = new ArrayList<Integer>();
    List<Integer> pos = new ArrayList<Integer>();
    for (Integer key : account.keySet()) {
      int money = account.get(key);
      if (money == 0) {
        continue;
      }
      if (money < 0) {
        neg.add(money);
      } else {
        pos.add(money);
      }
    }


    int ans = Integer.MAX_VALUE;
    Stack<Integer> stackNeg = new Stack<Integer>();
    Stack<Integer> stackPos = new Stack<Integer>();

    for (int i = 0; i < 1000; i++) {
      for (Integer num : neg) {
        stackNeg.push(num);
      }
      for (Integer num : pos) {
        stackPos.push(num);
      }

      int cur = 0;
      while (!stackNeg.isEmpty()) {
        int n = stackNeg.pop();
        int p = stackPos.pop();
        cur++;
        if (n == p) {
          continue;
        }
        if (n > p) {
          stackNeg.push(n - p);
        } else {
          stackPos.push(p - n);
        }
      }
      ans = Math.min(ans, cur);
      Collections.shuffle(neg);
      Collections.shuffle(pos);
    }
    return ans;
  }
}
