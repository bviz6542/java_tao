package com.example.java_tao.leet;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Solution144 implements  Solution {
    @Override
    public void run() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(preorderTraversal(root));
    }

    private List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    private void preorder(TreeNode node, List<Integer> arr) {
        if (node == null) return;
        arr.add(node.val);
        if (node.left != null) {
            preorder(node.left, arr);
        }
        if (node.right!= null) {
            preorder(node.right, arr);
        }
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