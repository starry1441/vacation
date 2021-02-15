package work2_15;

/**
 * Created with IntelliJ IDEA.
 * Description:反转链表https://leetcode-cn.com/problems/reverse-linked-list/
 * User: starry
 * Date: 2021 -02 -15
 * Time: 23:57
 */



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Work2 {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                head = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return head;
    }

}
