/**
 * 
 */
package com.chipatel.leetcode.util;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HashEntry {

  private int key;
  private int value;

  public HashEntry(int key, int value) {
    this.setKey(key);
    this.setValue(value);
  }

  /**
   * @return the key
   */
  public int getKey() {
    return key;
  }

  /**
   * @param key the key to set
   */
  public void setKey(int key) {
    this.key = key;
  }

  /**
   * @return the value
   */
  public int getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(int value) {
    this.value = value;
  }

}
