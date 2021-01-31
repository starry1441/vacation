package work1_26;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -01 -30
 * Time: 9:43
 */
public class BTNode {
    public int val;
    public BTNode left; //左子树的引用
    public BTNode right;//右子树的引用

    public BTNode(char val) {
        this.val = val;
    }
}
