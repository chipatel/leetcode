/**
 * 
 */
package com.chipatel.leetcode.util;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HashEntryOpenAddessing {
  private int key;
  private int value;

  HashEntryOpenAddessing(int key, int value) {
    this.key = key;
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public int getKey() {
    return key;
  }
}
