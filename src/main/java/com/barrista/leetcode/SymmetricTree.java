package com.barrista.leetcode;

public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {
    return isSymmetric(root.left, root.right);
  }

  public boolean isSymmetric(TreeNode left, TreeNode right) {
    // Null checks
    if (left == null && right == null) {
      return true;
    }
    if (left == null || right == null) {
      return false;
    }
    return left.val == right.val
            && isSymmetric(left.left, right.right)
            && isSymmetric(left.right, right.left);
  }

  public static class TreeNode {
    private final int val;
    private TreeNode left;
    private TreeNode right;

    public void setLeft(TreeNode left) {
      this.left = left;
    }

    public void setRight(TreeNode right) {
      this.right = right;
    }

    TreeNode(int val) {
      this.val = val;
    }
  }
}
