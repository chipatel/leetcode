/**
 * 
 */
package com.chipatel.leetcode.google.lrucache;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public interface LRUCache {
  public int get(int key);

  public void put(int key, int value);
}
