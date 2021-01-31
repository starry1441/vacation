package work1_30;

import work1_26.BTNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:判断一棵树是不是完全二叉树
 * User: starry
 * Date: 2021 -01 -30
 * Time: 9:29
 */

public class Work1 {
    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(BTNode root) {
        if(root == null) return true ;
        Queue<BTNode> queue = new LinkedList<BTNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BTNode cur = queue.poll();
            if(cur != null){
                queue.offer(cur.left);
                queue.offer((cur.right));
            }else {
                break;
            }
        }
        while (!queue.isEmpty()) {
            //依次弹出队列元素
            BTNode cur = queue.peek();
            if(cur != null) {
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }

    //前序遍历
    void preOrderTraversalNor(BTNode root){
        if(root == null) {
            return;
        }
        Stack<BTNode> stack =  new Stack<>();
        BTNode cur = root;
        while(cur!=null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                System.out.println(cur.val + " ");
                cur = cur.left;
            }
            BTNode top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }

    //中序遍历
    void inOrderTraversalNor(BTNode root){
        if(root == null) {
            return;
        }
        Stack<BTNode> stack =  new Stack<>();
        BTNode cur = root;
        while(cur!=null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.pop();
            System.out.println(top.val + " ");
            cur = top.right;
        }
        System.out.println();
    }

    //后序遍历
    void postOrderTraversalNor(BTNode root){
        if(root == null) {
            return;
        }
        Stack<BTNode> stack =  new Stack<>();
        BTNode cur = root;
        BTNode prev = null;
        while(cur!=null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.peek();
            if(top.right == null || top.right== prev) {
                stack.pop();
                System.out.println(top.val + " ");
                prev = top;
            } else {
                cur = top.right;
            }
        }
        System.out.println();
    }

    public int i = 0;
    //创建二叉树,(层序遍历，空为‘#’)
    public BTNode creatTree(String str) {
        if(str == null || str.length() <= 0) return null;
        BTNode root = null;
        if(str.charAt(i) != '#') {
            root = new BTNode(str.charAt(i));
            i++;
            root.left = creatTree(str);
            root.right = creatTree(str);
        } else {
            i++;
        }
        return root;
    }



}
