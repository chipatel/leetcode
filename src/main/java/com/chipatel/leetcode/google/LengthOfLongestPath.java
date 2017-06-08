/**
 * 
 */
package com.chipatel.leetcode.google;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 *
 *         Suppose we abstract our file system by a string in the following manner:
 * 
 *         The string "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" represents:
 * 
 *         dir subdir1 subdir2 file.ext The directory dir contains an empty sub-directory subdir1
 *         and a sub-directory subdir2 containing a file file.ext.
 * 
 *         The string
 *         "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
 *         represents:
 * 
 *         dir subdir1 file1.ext subsubdir1 subdir2 subsubdir2 file2.ext The directory dir contains
 *         two sub-directories subdir1 and subdir2. subdir1 contains a file file1.ext and an empty
 *         second-level sub-directory subsubdir1. subdir2 contains a second-level sub-directory
 *         subsubdir2 containing a file file2.ext.
 * 
 *         We are interested in finding the longest (number of characters) absolute path to a file
 *         within our file system. For example, in the second example above, the longest absolute
 *         path is "dir/subdir2/subsubdir2/file2.ext", and its length is 32 (not including the
 *         double quotes).
 * 
 *         Given a string representing the file system in the above format, return the length of the
 *         longest absolute path to file in the abstracted file system. If there is no file in the
 *         system, return 0.
 * 
 *         https://leetcode.com/problems/longest-absolute-file-path/#/description
 *
 */
public class LengthOfLongestPath {

  public int lengthLongestPath(String input) {
    String[] paths = input.split("\n");
    int[] stack = new int[paths.length + 1];
    int maxLen = 0;

    for (String s : paths) {
      int lev = s.lastIndexOf("\t") + 1;
      int curLen = stack[lev + 1] = stack[lev] + s.length() - lev + 1;
      if (s.contains(".")) {
        maxLen = Math.max(maxLen, curLen - 1);
      }
    }
    return maxLen;
  }

}