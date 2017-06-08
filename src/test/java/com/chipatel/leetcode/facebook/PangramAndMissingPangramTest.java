/**
 * 
 */
package com.chipatel.leetcode.facebook;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class PangramAndMissingPangramTest {
  /*
   * @Test public void test() { PangramAndMissingPangram pg = new
   * PangramAndMissingPangram("A quick brown fox jumps over the lazy dog");
   * System.out.println(pg.missingAlphabets(pg.getPangramTreeSet())); }
   * 
   * @Test public void test1() { PangramAndMissingPangram pg = new
   * PangramAndMissingPangram("A slow yellow fox crawls under the proactive dog");
   * System.out.println(pg.missingAlphabets(pg.getPangramTreeSet())); }
   */

  @Test
  public void checkPangram_Test1() {
    PangramAndMissingPangram pangram =
        new PangramAndMissingPangram("The quick brown fox jumps over a lazy dog.");
    assertTrue(pangram.isPangram());
  }

  @Test
  public void checkPangram_Test2() {
    PangramAndMissingPangram pangram =
        new PangramAndMissingPangram("The quick red fox jumps over a lazy dog.");
    assertFalse(pangram.isPangram());
  }

  @Test
  public void checkPangram_WithReallyBigString() {
    PangramAndMissingPangram pangram = new PangramAndMissingPangram(
        "Forsaking monastic tradition, twelve jovial friars gave up their vocation for a questionable existence on the flying trapeze");
    assertTrue(pangram.isPangram());
  }

  @Test
  public void checkPangram_Test3() {
    PangramAndMissingPangram pangram =
        new PangramAndMissingPangram("Crazy Fredericka bought many very exquisite opal jewels");
    assertTrue(pangram.isPangram());
  }

  @Test
  public void checkPangram_Test4() {
    PangramAndMissingPangram pangram =
        new PangramAndMissingPangram("Honest Fredericka bought many very exquisite opal jewels");
    assertFalse(pangram.isPangram());
  }

  @Test
  public void forPangramStringShouldReturnEmptySet() {
    PangramAndMissingPangram pangram =
        new PangramAndMissingPangram("The quick brown fox jumps over a lazy dog.");
    assertTrue(pangram.getMissingAlphabets(pangram.getPangramTreeSet()).isEmpty());
  }

  @Test
  public void forNonPangramStringShouldReturnMissingAlphabets() {
    PangramAndMissingPangram pangram =
        new PangramAndMissingPangram("The quick brown fox jumps over busy dog.");
    Set<Character> actual = pangram.getMissingAlphabets(pangram.getPangramTreeSet());
    Set<Character> expected = new TreeSet<Character>();
    expected.add('a');
    expected.add('l');
    expected.add('z');

    assertEquals(expected, actual);
  }


  @Test
  public void forNonPangramStringShouldReturnMissingAlphabets_Test2() {
    PangramAndMissingPangram pangram = new PangramAndMissingPangram(" b cd x rs  ijk pno f vu");
    Set<Character> actual = pangram.getMissingAlphabets(pangram.getPangramTreeSet());
    Set<Character> expected = new HashSet<Character>();
    expected.add('a');
    expected.add('e');
    expected.add('g');
    expected.add('h');
    expected.add('l');
    expected.add('m');
    expected.add('q');
    expected.add('t');
    expected.add('w');
    expected.add('y');
    expected.add('z');

    assertEquals(expected, actual);
  }
}
