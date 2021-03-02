package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:环形链表II https://leetcode-cn.com/problems/linked-list-cycle-ii/
 * User: starry
 * Date: 2021 -02 -17
 * Time: 21:47
 */
public class Work5 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            if(fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }while(slow != fast);
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }

}
