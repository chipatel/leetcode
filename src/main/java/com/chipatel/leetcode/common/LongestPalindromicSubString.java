/**
 * 
 */
package com.chipatel.leetcode.common;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 * 
 *         https://leetcode.com/problems/longest-palindromic-substring/#/description
 *
 */
public class LongestPalindromicSubString {
  private int lo, maxLen;


  public String longestPalindrome(String s) {
    int len = s.length();
    if (len < 2) {
      return s;
    }

    for (int i = 0; i < len - 1; i++) {
      extendPalindrome(s, i, i); // assume odd length
      extendPalindrome(s, i, i + 1); // assume even length
    }
    return s.substring(lo, lo + maxLen);
  }


  private void extendPalindrome(String s, int j, int k) {
    while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
      j--;
      k++;
    }
    if (maxLen < k - j - 1) {
      lo = j + 1;
      maxLen = k - j - 1;
    }
  }


  public String longestPalindromeWrong(String str) {
    /*
     * for (int i = 0, j = str.length(); i < (str.length() / 2); i++, j--) { //
     * System.out.println(str.substring(i, j)); if (isPalindrome(str.substring(i, j))) { return
     * str.substring(i, j); } }
     */

    for (int i = 0; i < str.length(); i++) {
      if (isPalindrome(str.substring(i, str.length()))) {
        return str.substring(i);
      }
    }

    for (int i = str.length(); i >= 0; i++) {
      if (isPalindrome(str.substring(0, i))) {
        return str.substring(0, i);
      }
    }
    return "";
  }

  public boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

}
