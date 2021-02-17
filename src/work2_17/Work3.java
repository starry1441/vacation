package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:相交链表https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * User: starry
 * Date: 2021 -02 -17
 * Time: 20:12
 */
public class Work3 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int count = size(headA)-size(headB);
        if(count > 0) {
            while(count != 0) {
                curA = curA.next;
                count--;
            }
        }else {
            while(count != 0) {
                curB = curB.next;
                count++;
            }
        }
        while(curA != curB) {
            if(curA == null) return null;
            curA = curA.next;
            curB = curB.next;
        }
        return curA;
    }

    public int size(ListNode head) {
        if(head == null) return 0;
        int count = 0;
        ListNode cur = head;
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

}
