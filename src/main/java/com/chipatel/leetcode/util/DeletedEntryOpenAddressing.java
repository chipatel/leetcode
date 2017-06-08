/**
 * 
 */
package com.chipatel.leetcode.util;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class DeletedEntryOpenAddressing extends HashEntryOpenAddessing {
  private static DeletedEntryOpenAddressing entry = null;

  private DeletedEntryOpenAddressing() {
    super(-1, -1);
  }

  public static DeletedEntryOpenAddressing getUniqueDeletedEntry() {
    if (entry == null)
      entry = new DeletedEntryOpenAddressing();
    return entry;
  }
}
