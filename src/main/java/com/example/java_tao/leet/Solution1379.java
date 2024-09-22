package com.example.java_tao.leet;

public class Solution1379 implements Solution {
    private TreeNode ans;

    @Override
    public void run() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(getTargetCopy(root, root, node3).val);
    }

    private final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(cloned, target.val);
        return ans;
    }

    private void dfs(TreeNode node, int val) {
        if (node.val == val) {
            ans = node;
            return;
        }
        if (node.left != null) {
            dfs(node.left, val);
        }
        if (node.right != null) {
            dfs(node.right, val);
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
