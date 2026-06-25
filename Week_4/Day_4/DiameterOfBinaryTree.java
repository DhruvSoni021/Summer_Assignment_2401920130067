// package Week_4.Day_4;

import javax.swing.tree.TreeNode;

public class DiameterOfBinaryTree {
       public int diameterOfBinaryTree(TreeNode root) {
        int[] dia = new int[1];
        height(root,dia);
        return dia[0];
    }
    public int height(TreeNode root,int[] dia)
    {
        if(root == null) return 0;

        int leftH = height(root.left,dia);
        int rightH = height(root.right,dia);

        dia[0] = Math.max(dia[0], leftH + rightH);

        return 1+ Math.max(leftH , rightH);

    }
}
