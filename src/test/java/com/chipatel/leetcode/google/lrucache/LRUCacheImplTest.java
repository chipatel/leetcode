/**
 * 
 */
package com.chipatel.leetcode.google.lrucache;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class LRUCacheImplTest {

  @Test
  public void testOverWriteValue() {
    LRUCacheImpl lru = new LRUCacheImpl(5);
    lru.put(1, 1);
    lru.put(2, 10);
    lru.put(1, 20);
    Assert.assertEquals(20, lru.get(1));
  }


  @Test
  public void testFullMapAndOverWrite() {
    LRUCacheImpl lru = new LRUCacheImpl(5);
    lru.put(1, 1);
    lru.put(2, 10);
    lru.put(3, 100);
    lru.put(5, 52);
    lru.put(4, 457);
    lru.put(3, 436);
    lru.put(1, 345);

    Assert.assertEquals(345, lru.get(1));
    Assert.assertEquals(10, lru.get(2));
    Assert.assertEquals(436, lru.get(3));
    Assert.assertEquals(-1, lru.get(10));
  }

}
