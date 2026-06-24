// package Week_4.Day_3;

import javax.swing.tree.TreeNode;

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return check(Long.MIN_VALUE,root, Long.MAX_VALUE);
    }

    public boolean check(long min, TreeNode node, long max) 
    {
        if(node == null) return true;

        if(node.val <= min || node.val >= max)
            return false;

        return check(min , node.left, node.val) && check(node.val, node.right, max);
    }
}
