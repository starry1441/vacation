package work2_19;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -02 -19
 * Time: 13:51
 */

class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;

    public ListNode(int val) {
        this.val = val;
    }
}

public class DoubleLinkedList {

    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(head == null) {
            head = node;
            last = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(last == null) {
            head = node;
            last = node;
            return;
        }
        last.next = node;
        node.prev = last;
        last = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size()) return;
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = head;
        ListNode node = new ListNode(data);
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //找到所找节点
    public ListNode findNode(int key) {
        ListNode cur = head;
        while (cur != null) {
            if(cur.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = findNode(key);
        if(cur == null) return;
        if(cur == head) {
            head = head.next;
            head.prev = null;
            return;
        }
        if(cur == last) {
            last = last.prev;
            last.next = null;
            return;
        }
        cur.next.prev = cur.prev;
        cur.prev.next = cur.next;
    }

    //删除节点方法二
    public void remove2(int key){
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == key) {
                if(cur == head) {
                    head = head.next;
                    head.prev = null;

                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        last = last.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == key) {
                if(cur == head) {
                    head = head.next;
                    head.prev = null;

                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        last = last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size(){
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display(){
        ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        head = null;
        last = null;
    }

    public void clear2() {
        ListNode cur = head;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        last = null;
        head = null;
    }

    public static void main(String[] args) {
        DoubleLinkedList a = new DoubleLinkedList();
        a.addFirst(1);
        a.addFirst(2);
        a.addFirst(3);
        a.addFirst(4);
        a.display();
        System.out.println("=============");
        a.addLast(5);
        a.addLast(6);
        a.display();
        System.out.println("=============");
        a.addIndex(6,88);
        a.addIndex(0,99);
        a.addIndex(3,99);
        a.display();
        System.out.println("=============");
        System.out.println(a.contains(5));
        System.out.println(a.contains(55));
        System.out.println("=============");
        a.remove(99);
        a.remove(88);
        a.remove(99);
        a.display();
        System.out.println("=============");
        a.addFirst(2);
        a.addLast(2);
        a.display();
        a.removeAllKey(2);
        a.display();
        System.out.println("=============");
        a.clear();
    }

}
