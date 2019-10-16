package com.company.leetcode.week1.easy;

import java.util.Stack;

/**
 * created by benyafang on 2019/10/16 0:29
 * */
public class _20_isValid {
    public static boolean isValid(String s) {
        Stack<Character> tmp = new Stack<Character>();
        for(int i = 0; i < s.length();i++){

            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                tmp.push(s.charAt(i));
            }else if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){

                /**
                 * pop出栈的时候一定要判断栈是否为空
                 * */
                if(tmp.empty())return false;
                char t = tmp.pop();
                if(!(t == '{' && s.charAt(i) == '}' || t == '[' && s.charAt(i) == ']' || t == '(' && s.charAt(i) == ')'))
                    return false;
            }
        }

        return tmp.empty();

    }
    public static void main(String[] args){
        Boolean res = isValid("[");
        System.out.println(res);
    }
}

