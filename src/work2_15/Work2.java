package work2_15;

/**
 * Created with IntelliJ IDEA.
 * Description:反转链表https://leetcode-cn.com/problems/reverse-linked-list/
 * User: starry
 * Date: 2021 -02 -15
 * Time: 23:57
 */

public class Work2 {

    //改变前后节点指向
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

    //头插法
    public ListNode reverseList1 (ListNode head) {
        if(head == null) {
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

}
