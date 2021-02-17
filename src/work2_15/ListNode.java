package work2_15;

/**
 * Created with IntelliJ IDEA.
 * Description:链表节点
 * User: starry
 * Date: 2021 -02 -16
 * Time: 10:47
 */
public class ListNode {

    public ListNode next;
    public int val;
    ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    
}