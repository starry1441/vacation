package work1_30;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -01 -30
 * Time: 20:02
 */

import work1_26.BTNode;

/**
 public class BTNode {
 int val = 0;
 BTNode left = null;
 BTNode right = null;

 public BTNode(int val) {
 this.val = val;

 }

 }
 */
public class Work3 {
    public BTNode prev = null;
    public void ConvertChild(BTNode pCur) {
        if(pCur == null) return;
        ConvertChild(pCur.left);
        pCur.left = prev;
        if(prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        ConvertChild(pCur.right);
    }

    public BTNode Convert(BTNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        ConvertChild(pRootOfTree);
        BTNode head = pRootOfTree;
        while(head.left != null) {
            head = head.left;
        }
        return head;
    }
}
