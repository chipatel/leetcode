/**
 * 
 */
package com.chipatel.leetcode.google.utils;

import java.util.HashMap;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */

/*
 * This example source code demonstrates the use of getOrDefault() method of HashMap class
 */

public class HashMapGetOrDefaultExample {

  public static void main(String[] args) throws InterruptedException {

    int idNum = 98712;
    HashMap<Integer, String> map = init();
    System.out
        .println("Student with id number " + idNum + " is " + map.getOrDefault(idNum, "John Doe"));

  }

  private static HashMap<Integer, String> init() {
    // declare the hashmap
    HashMap<Integer, String> mapStudent = new HashMap<>();
    // put contents to our HashMap
    mapStudent.put(73654, "Shyra Travis");
    mapStudent.put(98712, "Sharon Wallace");
    return mapStudent;
  }

}
