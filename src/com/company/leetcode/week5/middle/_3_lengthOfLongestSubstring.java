package com.company.leetcode.week5.middle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * created by Arya on 2019.11.23 16:03
 * 无重复字符的最长子串
 * 滑动窗口
 * */
public class _3_lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;//滑动窗口的左侧窗口和右侧窗口
        int n = s.length();
        int ans = 0;
        Set<Character> set = new HashSet<>();//存储窗口内存在的元素
        while (i < n && j < n){
            if(! set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j - i);
            }else{
                set.remove(s.charAt(i++));//如果当前字符串中存在重复字符，窗口右移
            }
        }
        return ans;
    }
    public int lengthOfLongestSubstring1(String s) {
        int i = 0, j = 0;//滑动窗口的左侧窗口和右侧窗口
        int n = s.length();
        int ans = 0;
        Map<Character,Integer> set = new HashMap<>();//存储窗口内存在的元素
        while (i < n && j < n){
            if(!set.containsKey(s.charAt(j))){
                set.put(s.charAt(j),j);
                j++;
                ans = Math.max(ans,j - i);
            }else{
                int i_index = set.get(s.charAt(j));
                while (i <= i_index){
                    set.remove(s.charAt(i++));//如果当前字符串中存在重复字符，窗口右移
                }
            }
        }
        return ans;
    }
}
