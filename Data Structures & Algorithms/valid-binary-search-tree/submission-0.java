class Solution {

    public boolean valid(TreeNode root, long l, long h) {
        if (root == null) {
            return true;
        }

        if (root.val <= l || root.val >= h) {
            return false;
        }

        return valid(root.left, l, root.val)
            && valid(root.right, root.val, h);
    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}