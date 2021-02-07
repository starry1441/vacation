package work1_31;

/**
 * Created with IntelliJ IDEA.
 * Description:https://leetcode-cn.com/problems/increasing-order-search-tree/submissions/
 * User: starry
 * Date: 2021 -01 -31
 * Time: 22:02
 */


public class Work2 {
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder(root);
        return ans.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;
        cur.right = node;
        cur = node;
        inorder(node.right);
    }
}