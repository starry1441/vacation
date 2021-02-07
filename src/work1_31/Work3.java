package work1_31;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:https://leetcode-cn.com/problems/merge-two-binary-trees/
 * User: starry
 * Date: 2021 -01 -31
 * Time: 23:05
 */
public class Work3 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) return t2;
        if(t2 == null) return t1;
        TreeNode cur = new TreeNode(t1.val + t2.val);
        cur.left = mergeTrees(t1.left, t2.left);
        cur.right = mergeTrees(t1.right, t2.right);
        return cur;
    }
}
