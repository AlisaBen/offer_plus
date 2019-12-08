package com.company.leetcode.week7.middle;

import java.util.Stack;

/**
 * created by Arya on 2019.12.8 13:43
 * 简化路径
 * 注意字符串的相等需要用equals而不是==
 * */
public class _71_simplifyPath {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] str = path.split("/");//"",  .,  ..,   abc
        for(String x:str){
            if(x.equals("") ||x.equals("."))continue;
            else if(x.equals("..")){
                if(!s.empty())s.pop();
            }else{
                s.push(x);
            }
        }
        StringBuilder t = new StringBuilder();
        if(s.empty())t.append("/");
        for(int i = 0;i < s.size();i++){
            t.append("/" + s.get(i));
        }
        return t.toString();



    }
}
