package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:链表的回文结构
 * https://www.nowcoder.com/practice/d281619e4b3e4a60a2cc66ea32855bfa?tpId=49&tqId=29370&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2F2016test%2Fquestion-ranking&tab=answerKey
 * User: starry
 * Date: 2021 -02 -17
 * Time: 11:43
 */
public class Work2 {

    public boolean chkPalindrome(ListNode A) {
        //先快慢指针找到中间节点
        ListNode fast = A;
        ListNode slow = A;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //然后翻转中间节点后面节点的指向
        ListNode cur = slow.next;
        slow.next =null;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }

        //最后从后往前  以及  从前往后  比较每个节点的值
        while(slow != null) {
            if(slow.val != A.val) {
                return false;
            }
            slow = slow.next;
            A = A.next;
        }
        return true;
    }

}
