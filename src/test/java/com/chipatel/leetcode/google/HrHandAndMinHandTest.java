/**
 * 
 */
package com.chipatel.leetcode.google;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class HrHandAndMinHandTest {
  HrHandAndMinHand angleOnClock = new HrHandAndMinHand();

  @Test
  public void testTwentyFiveMinutes() {
    Assert.assertEquals(150.0, angleOnClock.degreeBetweenHrHandAndMinHand(0, 25), 0.0);
  }

  @Test
  public void testTwelveAM() {
    Assert.assertEquals(0.0, angleOnClock.degreeBetweenHrHandAndMinHand(0, 0), 0.0);
  }

  @Test
  public void testTwelvePM() {
    Assert.assertEquals(0.0, angleOnClock.degreeBetweenHrHandAndMinHand(12, 0), 0.0);
  }

  @Test
  public void testFourHrANDFiftyMinutes() {
    System.out.println(angleOnClock.degreeBetweenHrHandAndMinHand(12, 30));
    Assert.assertEquals(205.0, angleOnClock.degreeBetweenHrHandAndMinHand(4, 50), 0.0);
  }
}
