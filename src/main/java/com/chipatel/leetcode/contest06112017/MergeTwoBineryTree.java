/**
 * 
 */
package com.chipatel.leetcode.contest06112017;

import com.chipatel.leetcode.util.TreeNode;

/**
 * @author Chiragkumar Patel <a href="https://github.com/chipatel">GitHub</a>
 *
 *         Given two binary trees and imagine that when you put one of them to cover the other, some
 *         nodes of the two trees are overlapped while the others are not.
 * 
 *         You need to merge them into a new binary tree. The merge rule is that if two nodes
 *         overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT
 *         null node will be used as the node of new tree.
 *
 */
public class MergeTwoBineryTree {
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    return helper(t1, t2);
  }

  public TreeNode helper(TreeNode t1, TreeNode t2) {
    TreeNode newTreeNode;
    if (t1 != null && t2 == null) {
      return t1;
    }
    if (t1 == null & t2 != null) {
      return t2;
    }
    if (t1 != null && t2 != null) {
      newTreeNode = new TreeNode(t1.val + t2.val);
      newTreeNode.left = helper(t1.left, t2.left);
      newTreeNode.right = helper(t1.right, t2.right);
      return newTreeNode;
    }
    return null;
  }
}
