// package Week_4.Day_4;

import javax.swing.tree.TreeNode;

public class PathSum {
     int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return helper(root,0);
    }
    public boolean helper(TreeNode root, int sum)
    {
        if(root == null) return false;
        sum+=root.val;
        if(root.left==null && root.right==null) return sum == target;
        boolean lsum = helper(root.left,sum);
        boolean rsum = helper(root.right,sum);
        return lsum||rsum;
    }
}
