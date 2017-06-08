/**
 * 
 */
package com.chipatel.leetcode.facebook;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class BuildAggregations {

  public String aggregatedQuery(String[] aggLevel) {
    String[] allDims = {"d1", "d2", "d3", "d4", "d5"};
    String baseQuery = "SELECT %s, COUNT(DISTINCT userId) AS users FROM table %s";
    String[] queries = new String[1];
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i < allDims.length; i++) {
      sb.append("\n");
    }
    return sb.toString();
  }

}
