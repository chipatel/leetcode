/**
 * 
 */
package com.chipatel.leetcode.util;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HashMap {
  private static final int TABLE_SIZE = 128;
  HashEntry[] table;

  public HashMap() {
    table = new HashEntry[TABLE_SIZE];
    for (int i = 0; i < TABLE_SIZE; i++) {
      table[i] = null;
    }
  }

  public int get(int key) {
    int hash = tableHashing(key);
    if (table[hash] == null) {
      return -1;
    } else {
      return table[hash].getValue();
    }
  }

  public void put(int key, int value) {
    int hash = tableHashing(key);
    table[hash] = new HashEntry(key, value);
  }

  public int tableHashing(int key) {
    int hash = key % TABLE_SIZE;
    while (table[hash] != null && table[hash].getKey() != key) {
      hash = (hash + 1) % TABLE_SIZE;
    }
    return hash;
  }

}
