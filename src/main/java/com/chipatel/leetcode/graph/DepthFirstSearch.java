/**
 * 
 */
package com.chipatel.leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class DepthFirstSearch {

  Map<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

  private Node getNode(int id) {
    return nodeLookup.get(id);
  }

  public void addEdge(int source, int destination) {
    Node s = getNode(source);
    Node d = getNode(destination);
    s.adjecent.add(d);
  }

  public boolean hasPathDFS(int source, int destination) {
    Node s = getNode(source);
    Node d = getNode(destination);

    Set<Integer> visited = new HashSet<Integer>();
    return hasPathDFS(s, d, visited);
  }

  public boolean hasPathDFS(Node source, Node destination, Set<Integer> visited) {
    if (visited.contains(source.id)) {
      return false;
    }
    visited.add(source.id);
    if (source == destination) {
      return true;
    }

    for (Node child : source.adjecent) {
      if (hasPathDFS(child, destination, visited)) {
        return true;
      }
    }
    return false;
  }

}
