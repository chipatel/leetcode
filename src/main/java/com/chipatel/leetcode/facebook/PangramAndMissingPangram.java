/**
 * 
 */
package com.chipatel.leetcode.facebook;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class PangramAndMissingPangram {
  private Set<Character> pangramTreeSet = new TreeSet<Character>();

  public PangramAndMissingPangram(String pangramString) {
    addUniqueAlphabets(pangramString);
  }

  public void addUniqueAlphabets(String pangramString) {
    for (char ch : pangramString.toLowerCase().toCharArray()) {
      if ((ch - 'a') >= 0 || (ch - 'a' >= 25)) {
        pangramTreeSet.add(ch);
      }
    }
  }

  public Set<Character> getMissingAlphabets(Set<Character> pangraTreeSet) {
    Set<Character> missingTreeSet = new TreeSet<Character>();
    if (!isPangram()) {
      StringBuilder sb = new StringBuilder();
      int counter = 0;

      for (char ch : pangraTreeSet) {
        while (counter != (ch - 'a')) {
          sb.append((char) (counter + 'a'));
          missingTreeSet.add((char) (counter + 'a'));
          counter++;
        }
        counter++;
      }
      for (int i = counter; i < 26; i++) {
        sb.append((char) (i + 'a'));
        missingTreeSet.add((char) (i + 'a'));
      }
    }
    return missingTreeSet;

  }

  /**
   * @return the pangramTreeSet
   */
  public Set<Character> getPangramTreeSet() {
    return pangramTreeSet;
  }

  /**
   * @param pangramTreeSet the pangramTreeSet to set
   */
  public void setPangramTreeSet(Set<Character> pangramTreeSet) {
    this.pangramTreeSet = pangramTreeSet;
  }

  public boolean isPangram() {
    return pangramTreeSet.size() == 26;
  }

}

