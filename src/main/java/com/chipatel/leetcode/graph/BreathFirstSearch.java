/**
 * 
 */
package com.chipatel.leetcode.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 */
public class BreathFirstSearch {

  Map<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

  private Node getNode(int id) {
    return nodeLookup.get(id);
  }

  public void addEdge(int source, int destination) {
    Node s = getNode(source);
    Node d = getNode(destination);
    s.adjecent.add(d);
  }

  public boolean hasPathBFS(int source, int destination) {
    return hasPathBFS(getNode(source), getNode(destination));
  }

  private boolean hasPathBFS(Node source, Node destination) {
    LinkedList<Node> nextToVisit = new LinkedList<Node>();
    Set<Integer> visited = new HashSet<Integer>();

    nextToVisit.add(source);
    while (!nextToVisit.isEmpty()) {
      Node node = nextToVisit.remove();
      if (node == destination) {
        return true;
      }

      if (visited.contains(node.id)) {
        continue;
      }
      visited.add(node.id);

      for (Node child : node.adjecent) {
        nextToVisit.add(child);
      }
    }
    return false;
  }

}
