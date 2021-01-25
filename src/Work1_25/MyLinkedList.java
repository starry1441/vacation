package Work1_25;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: starry
 * Date: 2021 -01 -25
 * Time: 19:56
 */

//节点类
class Node {
    public int val;
    public Node next;
    public Node(){

    }
    public Node(int val){
        this.val = val;
    }
}

public class MyLinkedList {

    public Node head;//表示当前链表的头

/*    public Node createLinked(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return node1;
    }*/

    /** Initialize your data structure here. */
    public MyLinkedList() {
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        head = node1;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node cur = head;
        int count = 0;
        while(cur != null){
            if(count == index){
                return cur.val;
            }
            cur = cur.next;
            count++;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newnode = new Node((val));
        newnode.next = head;
        head = newnode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        //空链表时，直接将新节点赋给头节点
        if(head == null){
            head = new Node(val);
            return;
        }
        //非空链表
        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
//        Node newnode = new Node(val);
//        cur.next = newnode;
//        newnode.next = null;
        cur.next = new Node(val);
        cur.next.next = null;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        //插在头
        if(index == 0){
            addAtHead(val);
            return;
        }
        //插在中间
        Node cur = new Node();
        cur = head;
        int count = 0;
        while(cur != null){
            if(count == index-1){
                Node newnode = new Node(val);
                if(cur.next == null){   //cur走到了最后一节
                    cur.next = newnode;
                    newnode.next = null;
                    break;
                }else{  //cur在中间
                    Node tmp = cur.next;
                    cur.next = newnode;
                    newnode.next = tmp;
                }
            }
            cur = cur.next;
            count++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        //删除头节点
        if(index == 0){
            head = head.next;
            return;
        }
        Node cur = new Node();
        cur = head;
        int count = 0;
        while(cur.next != null){
            if(count == index-1){
                if(cur.next.next == null){  //删除尾节点
                    cur.next = null;
                }else{  //删除中间节点
                    cur.next = cur.next.next;
                }
                break;
            }
            cur = cur.next;
            count++;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        Node head = myLinkedList.createLinked();
//        System.out.println("======================");
//        System.out.println(myLinkedList.get(1));
//        myLinkedList.addAtHead(0);
//        myLinkedList.addAtTail(5);
//        myLinkedList.addAtIndex(2,0);
//        myLinkedList.deleteAtIndex(4);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(2,2);
//        System.out.println(myLinkedList.get(1));
//        myLinkedList.deleteAtIndex(1);
//        System.out.println(myLinkedList.get(1));

        Node cur = myLinkedList.head;
        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */