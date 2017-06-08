/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class TextJustification {

  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> lines = new ArrayList<String>();

    int index = 0;
    while (index < words.length) {
      int count = words[index].length();
      int last = index + 1;

      while (last < words.length) {
        if (words[last].length() + count + 1 > maxWidth) {
          break;
        }
        count += words[last].length() + 1;
        last++;
      }

      StringBuilder sb = new StringBuilder();
      int diff = last - index - 1;
      if (last == words.length || diff == 0) {
        for (int i = index; i < last; i++) {
          sb.append(words[i] + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        for (int i = sb.length(); i < maxWidth; i++) {
          sb.append(" ");
        }
      } else {
        int spaces = (maxWidth - count) / diff;
        int r = (maxWidth - count) % diff;
        for (int i = index; i < last; i++) {
          sb.append(words[i]);
          if (i < (last - 1)) {
            for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
              sb.append(" ");
            }
          }
        }
      }
      lines.add(sb.toString());
      index = last;
    }
    return lines;
  }



  public List<String> fullJustify1(String[] words, int maxWidth) {
    List<String> res = new ArrayList<String>();

    int count = 0;
    Queue<String> q = new LinkedList<String>();


    for (String word : words) {
      // System.out.println(word);
      count += (word.length() + 1);
      if (count >= maxWidth) {
        // System.out.println(count + "-------------");
        // System.out.println(q.toString().length());
        int subLen = q.toString().length();
        int wC = q.size();
        StringBuffer sb = new StringBuffer();
        for (String tmp : q) {
          sb.append(tmp);
          int n = (maxWidth - (count - word.length())) / q.size();
          System.out.println(n);
          for (int i = 0; i < n; i++) {
            sb.append(" ");
          }
        }
        res.add(sb.toString());
        System.out
            .println(subLen + "\t" + wC + "\t" + res.toString() + "\t" + sb.toString().length());
        q = new LinkedList<String>();
        q.add(word);

        count = word.length();

      } else {
        q.add(word);
        // System.out.println(q.toString());
      }

    }

    return null;
  }

}
