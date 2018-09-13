package problems100;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> Min;
    int top;
    public MinStack() {
        top = 0;
        stack = new Stack<>();
        Min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (Min.empty())
            Min.add(x);
        else{
            Min.add(Math.min(Min.peek(),x));
            top ++;
        }
    }

    public void pop() {
        int temp = stack.pop();
        Min.pop();
        top --;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return Min.peek();
    }
}
