package com.example.java_tao.leet;

public class Solution101 implements Solution {
    @Override
    public void run() {
        TreeNode a_node4 = new TreeNode(4);
        TreeNode a_node5 = new TreeNode(5);
        TreeNode a_node2 = new TreeNode(2, a_node5, a_node4);
        TreeNode a_node3 = new TreeNode(3);
        TreeNode a_root = new TreeNode(1, a_node3, a_node2);

        TreeNode b_node4 = new TreeNode(4);
        TreeNode b_node5 = new TreeNode(5);
        TreeNode b_node2 = new TreeNode(2, b_node4, b_node5);
        TreeNode b_node3 = new TreeNode(3);
        TreeNode b_root = new TreeNode(1, b_node2, b_node3);

        TreeNode root = new TreeNode(0, a_root, b_root);

        System.out.println(isSymmetric(root));
    }

    private boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }

    static private class TreeNode {
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
