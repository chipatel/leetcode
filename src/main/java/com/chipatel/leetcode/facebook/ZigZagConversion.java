/**
 * 
 */
package com.chipatel.leetcode.facebook;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ZigZagConversion {
  public String convert(String s, int numRows) {

    char[] c = s.toCharArray();
    int len = s.length();
    StringBuffer[] sb = new StringBuffer[numRows];
    for (int i = 0; i < sb.length; i++) {
      sb[i] = new StringBuffer();
    }

    int index = 0;
    while (index < len) {
      for (int i = 0; i < numRows && index < len; i++) {
        sb[i].append(c[index++]);
      }
      for (int i = numRows - 2; i >= 1 && index < len; i--) {
        sb[i].append(c[index++]);
      }
    }
    for (int i = 1; i < sb.length; i++) {
      sb[0].append(i);
    }
    return sb[0].toString();
  }

}
