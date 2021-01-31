package work1_30;

import work1_26.BTNode;

/**
 * Created with IntelliJ IDEA.
 * Description:二叉树中找祖先节点
 * User: starry
 * Date: 2021 -01 -30
 * Time: 19:31
 */
public class Work2 {
    public BTNode lowestCommonAncestor(BTNode root, BTNode p, BTNode q) {
        if(root == null) return null;

        if(root == p || root == q) {
            return root;
        }
        BTNode left = lowestCommonAncestor(root.left,p,q);
        BTNode right = lowestCommonAncestor(root.right,p,q);

        if(left != null && right != null) {
            return root;
        }
        if(left != null) {
            return left;
        }
        if(right != null) {
            return right;
        }
        return null;
    }
}
