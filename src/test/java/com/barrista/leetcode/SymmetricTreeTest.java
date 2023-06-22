package com.barrista.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {
  SymmetricTree solution = new SymmetricTree();
  @Test
  void tree1223443ShouldReturnTrue() {
    SymmetricTree.TreeNode left = new SymmetricTree.TreeNode(2);
    left.setLeft(new SymmetricTree.TreeNode(3));
    left.setRight(new SymmetricTree.TreeNode(4));
    SymmetricTree.TreeNode right = new SymmetricTree.TreeNode(2);
    right.setLeft(new SymmetricTree.TreeNode(4));
    right.setRight(new SymmetricTree.TreeNode(3));
    SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
    root.setLeft(left);
    root.setRight(right);
    assertTrue(solution.isSymmetric(root));
  }

  @Test
  void tree12n3n3ShouldReturnFalse() {
    SymmetricTree.TreeNode left = new SymmetricTree.TreeNode(2);
    left.setRight(new SymmetricTree.TreeNode(3));
    SymmetricTree.TreeNode right = new SymmetricTree.TreeNode(2);
    right.setRight(new SymmetricTree.TreeNode(3));
    SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
    root.setLeft(left);
    root.setRight(right);
    assertFalse(solution.isSymmetric(root));
  }
}
