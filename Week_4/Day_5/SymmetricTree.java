// package Week_4.Day_5;

import javax.swing.tree.TreeNode;

public class SymmetricTree {
     public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetrichelp(root.left, root.right);
    }
    public boolean isSymmetrichelp(TreeNode left, TreeNode right) {
        if(left == null || right == null) return left == right;

        if(left.val != right.val) return false;

        return (isSymmetrichelp(left.left,right.right)) 
                &&
                (isSymmetrichelp(left.right, right.left));
    
    }
}
