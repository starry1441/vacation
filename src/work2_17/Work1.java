package work2_17;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:删除链表中重复的结点
 * https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId=13&tqId=11209&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tab=answerKey
 * User: starry
 * Date: 2021 -02 -17
 * Time: 10:20
 */
public class Work1 {

    //错误版，从头一直要要去的化没处理好
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null) return null;
        ListNode cur = pHead;
        ListNode pre = pHead;
        int tmp = pHead.val;
        if(pHead.next.val == tmp){
            while(pHead.next != null && pHead.next.val == tmp) {
                pHead = pHead.next;
            }
            if(pHead.next == null) return null;
            pHead = pHead.next;
        }

        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                tmp = cur.val;
            }
            if(tmp == cur.val) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return pHead;
    }

    //正确版
    public ListNode deleteDuplication1(ListNode pHead){
        if(pHead == null) return null;

        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;

        ListNode cur = pHead;
        while(cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while(cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
            }else {
                tmp.next = cur;
                tmp = tmp.next;
            }
            cur = cur.next;
        }
        newHead = newHead.next;
        tmp.next = null;
        return newHead;
    }

}
