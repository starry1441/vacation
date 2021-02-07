package work1_31;

/**
 * Created with IntelliJ IDEA.
 * Description:树的根节点
 * User: starry
 * Date: 2021 -01 -31
 * Time: 23:05
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}