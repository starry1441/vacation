package Work1_25;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个最小栈
 * User: starry
 * Date: 2021 -01 -25
 * Time: 10:53
 */
class MinStack {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minstack = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        if(minstack.empty()){
            minstack.push(x);
        }else if(x<=minstack.peek()){
            minstack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if(x == minstack.peek()){
            minstack.pop();
        }
    }

    //这个和最小栈没有关系
    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
