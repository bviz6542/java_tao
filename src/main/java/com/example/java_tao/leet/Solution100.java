package com.example.java_tao.leet;

public class Solution100 implements  Solution {
    @Override
    public void run() {
        Solution100.TreeNode a_node4 = new Solution100.TreeNode(4);
        Solution100.TreeNode a_node5 = new Solution100.TreeNode(5);
        Solution100.TreeNode a_node2 = new Solution100.TreeNode(2, a_node5, a_node4);
        Solution100.TreeNode a_node3 = new Solution100.TreeNode(3);
        Solution100.TreeNode a_root = new Solution100.TreeNode(1, a_node3, a_node2);

        Solution100.TreeNode b_node4 = new Solution100.TreeNode(4);
        Solution100.TreeNode b_node5 = new Solution100.TreeNode(5);
        Solution100.TreeNode b_node2 = new Solution100.TreeNode(2, b_node5, b_node4);
        Solution100.TreeNode b_node3 = new Solution100.TreeNode(3);
        Solution100.TreeNode b_root = new Solution100.TreeNode(1, b_node3, b_node2);

        System.out.println(isSameTree(a_root, b_root));
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
