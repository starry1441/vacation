package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:环形链表https://leetcode-cn.com/problems/linked-list-cycle/
 * User: starry
 * Date: 2021 -02 -17
 * Time: 20:49
 */
public class Work4 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        do {
            if(fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }while(slow != fast);
        return true;
    }

}
