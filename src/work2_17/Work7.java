package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:旋转链表https://leetcode-cn.com/problems/rotate-list/
 * User: starry
 * Date: 2021 -02 -17
 * Time: 22:20
 */
public class Work7 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode cur = head;
        int count = 1;
        while(cur.next != null) {
            cur = cur.next;
            count++;
        }
        cur.next = head;
        int step = count-k%count;
        while(step != 0) {
            head = head.next;
            step--;
        }
        cur = head;
        while(count != 1) {
            cur = cur.next;
            count--;
        }
        cur.next = null;
        return head;
    }

    //时间会慢
    public ListNode rotateRight2(ListNode head, int k) {
        if(head == null) return null;
        if(k == 0) return head;
        ListNode fast = head;
        ListNode slow = head;
        while(k != 0) {
            if(fast.next != null) {
                fast = fast.next;
            }else {
                fast = head;
            }
            k--;
        }
        if(fast == slow) return head;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode tmp = slow.next;
        slow.next = null;
        fast.next = head;
        head = tmp;
        return head;
    }

}
