package com.example.java_tao.leet;

public class Solution2331 implements Solution {
    @Override
    public void run() {
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(0);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(0);
        TreeNode root = new TreeNode(2, node2, node3);

        System.out.println(evaluateTree(root));
    }

    private boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }

    private boolean dfs(TreeNode node) {
        if (node.val == 0) {
            return false;
        } else if (node.val == 1) {
            return true;
        } else if (node.val == 2) {
            return dfs(node.left) || dfs(node.right);
        } else {
            return dfs(node.left) && dfs(node.right);
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { this.val = x; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
