/**
 * 
 */
package com.chipatel.leetcode.graph;

import java.util.LinkedList;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class Node {

  public int id;

  public Node(int id) {
    this.id = id;
  }

  LinkedList<Node> adjecent = new LinkedList<Node>();
}
