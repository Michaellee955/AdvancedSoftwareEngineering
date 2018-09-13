package problems100;

import javax.swing.tree.TreeNode;

/*


public class HouseRobberIII {

    private int rob(TreeNode root){

        if (root==null) return 0;
        int val = 0;
        val += rob(root.left.left) + rob(root.left.right);
        val += rob(root.right.left) + rob(root,right.right);

        return Math.max(val+root.val,rob(root.left)+rob(root.right));
    }
}
 */
