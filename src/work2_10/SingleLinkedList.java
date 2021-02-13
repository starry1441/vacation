package work2_10;

/**
 * Created with IntelliJ IDEA.
 * Description:单链表
 * User: starry
 * Date: 2021 -02 -10
 * Time: 16:56
 */

class Node {
    public int val;
    public Node next;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
    }
}

// 1、无头单向非循环链表实现
public class SingleLinkedList {

    public Node head;   //头节点

    public Node createLinked() {
        head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        return head;
    }

    //找最后一个节点
    public Node findLastNode() {
        if (head == null) {
            System.out.println("没有头节点");
            return null;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找第n个节点
    public Node findN(int n) {
        if (head == null) {
            System.out.println("单链表为空！");
            return null;
        }
        if (n <= 0) {
            System.out.println("n太小了");
            return null;
        }
        if (n > size()) {
            System.out.println("n太大了");
        }
        int count = 1;
        Node cur = head;
        while (count != n) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size()) {
            System.out.println("插入位置不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        int count = 0;
        Node cur = head;
        Node node = new Node(data);
        while (cur != null) {
            if(count+1 == index) {
                node.next =cur.next;
                cur.next = node;
                return;
            }
            cur = cur.next;
            count++;
        }
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (head == null) return;;
        while(head != null && head.val == key) {
            head = head.next;
        }
        Node cur = head;
        Node pre = cur;
        while (cur != null) {
            if (cur.val == key) {
                pre.next = cur.next;
                return;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (head == null) return;;
        if(head.val == key) {
            head = head.next;
        }
        Node cur = head;
        Node pre = cur;
        while (cur != null) {
            if (cur.val == key) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size(){
        Node cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    public void display(){
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        head.next = null;
    }

    public static void main(String[] args) {
        SingleLinkedList a = new SingleLinkedList();
        a.createLinked();
        a.display();
        System.out.println("=================");
        Node ret = a.findLastNode();
        System.out.println(ret.val);
        System.out.println("=================");
        Node ret2 = a.findN(2);
        System.out.println(ret2.val);
        System.out.println("=================");
        a.addFirst(0);
        a.display();
        System.out.println("=================");
        a.addLast(5);
        a.display();
        System.out.println("=================");
        a.addIndex(4,100);
        a.display();
        System.out.println("=================");
        System.out.println(a.contains(100));
        System.out.println("=================");
        a.remove(100);
        a.display();
        System.out.println("=================");
        a.addLast(2);
        a.addIndex(2,2);
        a.addIndex(6,2);
        a.display();
        a.removeAllKey(2);
        a.display();
    }

}
