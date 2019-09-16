package com.company.jian_zhi_offer;

import java.util.Stack;

public class C2_Sequence {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()){
            int tmp = stack1.pop();
            stack2.push(tmp);
        }
        if(!stack2.isEmpty()){
            int res = stack2.pop();
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return res;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){

    }
}
