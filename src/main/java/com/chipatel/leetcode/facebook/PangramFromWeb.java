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



public class PangramFromWeb {
  private static final int ASCII_VALUE_OF_SMALL_CASE_CHAR_A = 97;
  private static final int ASCII_VALUE_OF_SMALL_CASE_CHAR_Z = 122;
  private Set<Character> distinctCharsInInputStringSortedAlphabetically = new TreeSet<Character>();

  public PangramFromWeb(final String inputString) {
    addUniqueAlphabetsToSet(inputString);
  }

  public boolean isPangram() {
    return distinctCharsInInputStringSortedAlphabetically.size() == 26;
  }

  private void addUniqueAlphabetsToSet(final String inputString) {
    for (Character character : inputString.toLowerCase().toCharArray()) {
      if ((int) character >= ASCII_VALUE_OF_SMALL_CASE_CHAR_A
          && (int) character <= ASCII_VALUE_OF_SMALL_CASE_CHAR_Z) {
        distinctCharsInInputStringSortedAlphabetically.add(character);
      }
    }
  }

  public Set<Character> getMissingAlphabets() {
    Set<Character> missingAlphabets = new TreeSet<Character>();
    if (!isPangram()) {
      char alphabet_a = 'a';
      int asciiValue = alphabet_a;
      for (Character alphabetsInInput : distinctCharsInInputStringSortedAlphabetically) {
        do {
          if ((int) alphabetsInInput > asciiValue) {
            missingAlphabets.add((char) asciiValue);
          }
          asciiValue++;
        } while ((int) alphabetsInInput >= asciiValue);

      }

      if (asciiValue <= ASCII_VALUE_OF_SMALL_CASE_CHAR_Z) {
        do {
          missingAlphabets.add((char) asciiValue);
          asciiValue++;
        } while (asciiValue <= ASCII_VALUE_OF_SMALL_CASE_CHAR_Z);
      }

    }
    System.out.println("missingAlphabets" + missingAlphabets);
    return missingAlphabets;
  }

}
