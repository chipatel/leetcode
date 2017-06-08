/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class SentenceScreenFitting {
  public static void main(String[] args) {
    System.out.println(wordsTyping(new String[] {"hello", "world"}, 2, 8));
  }

  public static int wordsTyping(String[] sentence, int rows, int cols) {
    String str = String.join(" ", sentence) + " ";
    int start = 0;
    int len = str.length();

    for (int i = 0; i < rows; i++) {
      start += cols;
      if (str.charAt(start % len) == ' ') {
        start++;
      } else {
        while (start > 0 && str.charAt((start - 1) % len) != ' ') {
          start--;
        }
      }
    }
    System.out.println(start);
    System.out.println(str);
    return start / str.length();
  }

}
