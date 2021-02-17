package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:删除中间节点https://leetcode-cn.com/problems/delete-middle-node-lcci/
 * User: starry
 * Date: 2021 -02 -17
 * Time: 22:02
 */
public class Work6 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next =  node.next.next;
    }

}
