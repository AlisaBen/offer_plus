package com.company.jian_zhi_offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 *
 * 压入的任意过程可以被弹出
 * */
public class C18_IsPopOrder {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        int j = 0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i = 0;i < pushA.length;i++){
            if(pushA[i] == popA[j]){
                j++;
            }else{
                s.push(pushA[i]);
            }
        }
        while (!s.isEmpty()){
            int t = s.pop();
            if(t != popA[j])return false;
            else j++;
        }
        return true;
    }

    public static void main(String[] args){
        int pushA[] = {1,2,3,4,5};
        int popA[] = {4,5,3,2,1};
        System.out.println(IsPopOrder(new int[]{1,2,3,4,5},new int[]{4,3,5,1,2}));
    }
}
