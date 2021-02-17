package work2_16;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:链表的中间结点https://leetcode-cn.com/problems/middle-of-the-linked-list/description/
 * User: starry
 * Date: 2021 -02 -16
 * Time: 10:21
 */
public class Work1 {

    public ListNode middleNode(ListNode head) {
        //快慢指针
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
