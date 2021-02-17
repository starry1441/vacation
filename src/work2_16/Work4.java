package work2_16;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:链表分割
 * https://www.nowcoder.com/practice/0e27e0b064de4eacac178676ef9c9d70?tpId=8&tqId=11004&rp=2&ru=%2Factivity%2Foj&qru=%2Fta%2Fcracking-the-coding-interview%2Fquestion-ranking&tab=answerKey
 * User: starry
 * Date: 2021 -02 -16
 * Time: 15:41
 */
public class Work4 {

    public ListNode partition(ListNode pHead, int x) {
        ListNode headA = new ListNode(x);
        ListNode headB = new ListNode(x);
        ListNode a = headA;
        ListNode b = headB;
        ListNode cur = pHead;
        while(cur != null) {
            if(cur.val < x) {
                a.next = cur;
                a = a.next;
            }else {
                b.next = cur;
                b = b.next;
            }
            cur = cur.next;
        }
        a.next = headB.next;
        b.next = null;
        headA = headA.next;
        return headA;
    }

}
