package com.example.java_tao.leet;

import java.util.ArrayList;
import java.util.List;

public class Solution257 implements Solution {
    @Override
    public void run() {
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(binaryTreePaths(root));
    }

    private List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder emptyString = new StringBuilder();
        inorder(root, ans, emptyString);
        return ans;
    }

    private void inorder(TreeNode node, List<String> accPath, StringBuilder curPath) {
        int curLength = curPath.length();
        if (curLength == 0) {
            curPath.append(node.val);
        } else {
            curPath.append("->").append(node.val);
        }

        if (node.left == null && node.right == null) {
            accPath.add(curPath.toString());
        } else {
            if (node.left != null) {
                inorder(node.left, accPath, new StringBuilder(curPath));
            }
            if (node.right != null) {
                inorder(node.right, accPath, new StringBuilder(curPath));
            }
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
