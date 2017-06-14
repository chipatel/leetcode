/**
 * 
 */
package com.chipatel.leetcode.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class ValidWordsFromPhoneKeyPadTest {
  ValidWordsFromPhoneKeyPad vwfpkp = new ValidWordsFromPhoneKeyPad();

  @Test
  public void test() {
    List<String> expt = new ArrayList<String>(
        Arrays.asList(new String[] {"AT", "AU", "AV", "BT", "BU", "BV", "CT", "CU", "CV"}));
    Assert.assertEquals(expt, vwfpkp.validDictionaryWords("28"));
  }
}
