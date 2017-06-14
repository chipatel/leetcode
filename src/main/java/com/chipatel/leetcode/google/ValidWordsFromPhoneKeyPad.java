/**
 * 
 */
package com.chipatel.leetcode.google;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ValidWordsFromPhoneKeyPad {

  public static final String[] DIGIT_TO_CHAR_MAPPING =
      {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
  public static final String DICTIONARY_FILE_PATH =
      "/Users/nishtha/Documents/workspace/leetcode/src/main/java/com/chipatel/leetcode/google/utils/words.txt";

  public List<String> validDictionaryWords(String digits) {
    Set<String> words = readDictionary();
    List<String> allPossibleWords = possibleWords(digits);
    List<String> res = new ArrayList<String>();
    for (String str : allPossibleWords) {
      if (words.contains(str)) {
        res.add(str);
      }
    }
    return res;
  }

  public List<String> possibleWords(String digits) {
    LinkedList<String> res = new LinkedList<String>();
    if (digits.isEmpty()) {
      return res;
    }
    res.add("");
    for (int i = 0; i < digits.length(); i++) {
      int d = Character.getNumericValue(digits.charAt(i));
      while (res.peek().length() == i) {
        String t = res.remove();
        for (char c : DIGIT_TO_CHAR_MAPPING[d].toCharArray()) {
          res.add(t + c);
        }
      }
    }
    return res;
  }

  public Set<String> readDictionary() {
    BufferedReader br = null;
    FileReader fr = null;
    Set<String> res = new HashSet<String>();
    try {
      fr = new FileReader(DICTIONARY_FILE_PATH);
      br = new BufferedReader(fr);
      String currLine;
      while ((currLine = br.readLine()) != null) {
        res.add(currLine);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null)
          br.close();
        if (fr != null)
          fr.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    return res;
  }
}
