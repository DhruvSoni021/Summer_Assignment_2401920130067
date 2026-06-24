import javax.swing.tree.TreeNode;

public class SearchInBST 
{
     public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        while(root!=null && root.val!=val)
        {
            if(val<root.val) root = root.left;
            else root = root.right;
        }
        return root;
    }
}