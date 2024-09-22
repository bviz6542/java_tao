package com.example.java_tao.leet;

import java.util.ArrayList;

public class Solution1022 implements Solution {
    @Override
    public void run() {
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(0);
        TreeNode node2 = new TreeNode(0, node4, node5);
        TreeNode node3 = new TreeNode(1);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(sumRootToLeaf(root));
    }

    private int sumRootToLeaf(TreeNode root) {
        ArrayList<Integer> values = new ArrayList<>();
        dfs(root, new StringBuilder(), values);
        int ans = 0;
        for (Integer i : values) {
            ans += i;
        }
        return ans;
    }

    private void dfs(TreeNode node, StringBuilder sb, ArrayList<Integer> values) {
        if (node == null) {
            return;
        }
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            values.add(calculateBinary(sb.toString()));
            return;
        }
        dfs(node.left, new StringBuilder(sb), values);
        dfs(node.right, new StringBuilder(sb), values);
    }

    private int calculateBinary(String str) {
        int val = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '1') {
                val += (int) Math.pow(2, len-i-1);
            }
        }
        return val;
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
