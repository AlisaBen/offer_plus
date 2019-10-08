package com.company.jian_zhi_offer;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * */
public class C17_StackMin {
    Stack<Integer> s = new Stack();
    Stack<Integer> ss = new Stack();

    public void push(int node) {
        s.push(node);
        Stack<Integer> tmp = new Stack();
        while (!ss.empty()){
            int t = ss.pop();
            if(t < node){
                tmp.push(t);
            }else{
                ss.push(t);
                break;
            }
        }
        ss.push(node);
        while (!tmp.isEmpty()){
            ss.push(tmp.pop());
        }

    }

    public void pop() {
        int t = s.pop();
        Stack<Integer> tmp = new Stack<>();
        while (!ss.isEmpty()){
            int tt = ss.pop();
            if(tt != t){
                tmp.push(tt);
            }else{
                while (!tmp.isEmpty()){
                    ss.push(tmp.pop());
                }
                break;
            }
        }

    }

    public int top() {
        int t = s.pop();
        s.push(t);
        return t;
    }

    public int min() {
        int t = ss.pop();
        ss.push(t);
        return t;
    }

    public static void main(String[] args){
        C17_StackMin s = new C17_StackMin();
        s.push(3);
        s.push(1);
        s.push(67);
        s.push(1);
        s.push(5);
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.min());
        System.out.println(s.top());
    }
}
