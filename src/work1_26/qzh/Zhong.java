package work1_26.qzh;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -01 -26
 * Time: 10:58
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Zhong {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root != null){
            list.add(root.val);
            //System.out.println(root.val);
            List<Integer> leftList = inorderTraversal(root.left);
            list.addAll(leftList);
            List<Integer> rightList = inorderTraversal(root.right);
            list.addAll(rightList);
        }
        return list;
    }
}