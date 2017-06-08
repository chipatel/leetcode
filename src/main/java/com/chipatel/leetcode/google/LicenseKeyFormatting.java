/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class LicenseKeyFormatting {

  /**
   * @param args
   */
  public static void main(String[] args) {
    System.out.println(licenseKeyFormatting("r", 1));
  }

  public static String licenseKeyFormatting(String S, int K) {
    String[] tmp = S.split("-");

    StringBuffer sb = new StringBuffer();
    for (String str : tmp) {
      sb.append(str);
    }

    int strLen = sb.length();
    int begin = strLen % K;

    int index = 0;
    StringBuffer res = new StringBuffer();
    System.out.println(sb.toString());
    System.out.println(begin);
    while (index <= strLen - 1) {
      if (index == 0 && begin != 0) {
        res.append(sb.toString().substring(index, index + begin));
        res.append("-");
        index += begin;
        System.out.println(res.toString());
      }
      res.append(sb.toString().substring(index, index + K));
      index += K;
      if (index < strLen - 1) {
        res.append("-");
      }
    }
    return res.toString().toUpperCase();


  }

}
