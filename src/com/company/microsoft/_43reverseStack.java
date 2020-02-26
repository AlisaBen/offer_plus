package com.company.microsoft;

import java.util.Stack;

/**颠倒栈，递归 */
class _43reverseStack{
    public static void addToStackBottom(Stack<Integer> s, int elem) {
        if (s.empty()) s.push(elem);
        else {
            int T = s.pop(); // 这个栈不空的话，先出来一个元素， 先出栈1，  最后一步出栈1，2，添加3，再上升栈，入栈2，1
            addToStackBottom(s, elem); // 把这个元素加进这个栈中， 入栈2
            s.push(T); // 再把出栈的元素入栈 ， 添加1，[1,2]
        }
    }
    public static Stack<Integer> reverse(Stack<Integer> s) {
        if (s.empty()) return s;
        int top = s.pop(); // 先出栈
        reverse(s); // 反转栈，这一步之前先后出栈3，2，1，递归后这里已经是空栈
        addToStackBottom(s, top); // 把出栈的元素添加到栈底,从栈底向上执行这一步，最开始空栈入栈1，上升栈第二步，添加2，上升第三步，添加3
        return s;
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s = reverse(s);
        while (!s.empty()){
            System.out.println(s.pop());
        }
    } 
}