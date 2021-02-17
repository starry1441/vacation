package work2_16;

import work2_15.ListNode;

/**
 * Created with IntelliJ IDEA.
 * Description:链表中倒数第k个结点
 * https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&rp=2&ru=%2Factivity%2Foj&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking&tab=answerKey
 * User: starry
 * Date: 2021 -02 -16
 * Time: 11:28
 */
public class Work2 {

    //第一次
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        int a = k;
        while(a != 0 && fast != null) {
            fast = fast.next;
            a--;
            count++;
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
            count++;
        }
        if(count < k) return null;
        return slow;
    }

    //优化
    public ListNode FindKthToTail1(ListNode head,int k) {
        ListNode fast = head;
        ListNode slow = head;
        while(k != 0) {
            if(fast != null){
                fast = fast.next;
                k--;
            }else {
                return null;
            }
        }
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
