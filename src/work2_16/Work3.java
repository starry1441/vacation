package work2_16;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:合并两个有序链表https://leetcode-cn.com/problems/merge-two-sorted-lists/description/
 * User: starry
 * Date: 2021 -02 -16
 * Time: 11:51
 */
public class Work3 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while(l1 != null && l2 != null) {
            if(l2.val <= l1.val) {
                tmp.next = l2;
                l2 = l2.next;
            }else {
                tmp.next = l1;
                l1 = l1.next;
            }
            tmp = tmp.next;
        }
        if(l2 == null) {
            tmp.next = l1;
        }else {
            tmp.next = l2;
        }
        head = head.next;
        return head;
    }

}
