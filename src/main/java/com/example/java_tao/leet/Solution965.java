package com.example.java_tao.leet;

public class Solution965 implements Solution {
    private boolean isUnival = true;
    private Integer rootNumber;
    @Override
    public void run() {
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(2);
        TreeNode root = new TreeNode(2, node2, node3);

        System.out.println(isUnivalTree(root));
    }

    private boolean isUnivalTree(TreeNode root) {
        rootNumber = root.val;
        dfs(root);
        return isUnival;
    }

    private void dfs(TreeNode node) {
        if (node.val != rootNumber) {
            isUnival = false;
            return;
        }
        if (node.left != null) {
            dfs(node.left);
        }
        if (node.right != null) {
            dfs(node.right);
        }
    }

    private static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
}
