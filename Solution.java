class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        if (left == -1) return -1;

        int right = height(node.right);
        if (right == -1) return -1;

        return (Math.abs(left - right) > 1) ? -1 : Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode balancedTree = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3)
        );

        TreeNode unbalancedTree = new TreeNode(1,
                new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
                null
        );

        Solution sol = new Solution();
        System.out.println("Balanced Tree: " + sol.isBalanced(balancedTree)); // true
        System.out.println("Unbalanced Tree: " + sol.isBalanced(unbalancedTree)); // false
    }
}
