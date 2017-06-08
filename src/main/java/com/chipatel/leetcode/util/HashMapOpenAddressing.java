/**
 * 
 */
package com.chipatel.leetcode.util;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HashMapOpenAddressing {
  private final static int TABLE_SIZE = 128;

  HashEntryOpenAddessing[] table;

  HashMapOpenAddressing() {
    table = new HashEntryOpenAddessing[TABLE_SIZE];
    for (int i = 0; i < TABLE_SIZE; i++)
      table[i] = null;
  }

  public int get(int key) {
    int hash = (key % TABLE_SIZE);
    int initialHash = -1;
    while (hash != initialHash && (table[hash] == DeletedEntryOpenAddressing.getUniqueDeletedEntry()
        || table[hash] != null && table[hash].getKey() != key)) {
      if (initialHash == -1)
        initialHash = hash;
      hash = (hash + 1) % TABLE_SIZE;
    }
    if (table[hash] == null || hash == initialHash)
      return -1;
    else
      return table[hash].getValue();
  }

  public void put(int key, int value) {
    int hash = (key % TABLE_SIZE);
    int initialHash = -1;
    int indexOfDeletedEntry = -1;
    while (hash != initialHash && (table[hash] == DeletedEntryOpenAddressing.getUniqueDeletedEntry()
        || table[hash] != null && table[hash].getKey() != key)) {
      if (initialHash == -1)
        initialHash = hash;
      if (table[hash] == DeletedEntryOpenAddressing.getUniqueDeletedEntry())
        indexOfDeletedEntry = hash;
      hash = (hash + 1) % TABLE_SIZE;
    }
    if ((table[hash] == null || hash == initialHash) && indexOfDeletedEntry != -1)
      table[indexOfDeletedEntry] = new HashEntryOpenAddessing(key, value);
    else if (initialHash != hash)
      if (table[hash] != DeletedEntryOpenAddressing.getUniqueDeletedEntry() && table[hash] != null
          && table[hash].getKey() == key)
        table[hash].setValue(value);
      else
        table[hash] = new HashEntryOpenAddessing(key, value);
  }

  public void remove(int key) {
    int hash = (key % TABLE_SIZE);
    int initialHash = -1;
    while (hash != initialHash && (table[hash] == DeletedEntryOpenAddressing.getUniqueDeletedEntry()
        || table[hash] != null && table[hash].getKey() != key)) {
      if (initialHash == -1)
        initialHash = hash;
      hash = (hash + 1) % TABLE_SIZE;
    }
    if (hash != initialHash && table[hash] != null)
      table[hash] = DeletedEntryOpenAddressing.getUniqueDeletedEntry();
  }

}
