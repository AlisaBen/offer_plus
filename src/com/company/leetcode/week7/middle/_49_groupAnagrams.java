package com.company.leetcode.week7.middle;

import java.util.*;

/**
 * created by Arya on 2019.12.7 14:34
 * 字母异位词分组
 * */
public class _49_groupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] array = s.toCharArray();
            Arrays.sort(array);
            String s1 = String.valueOf(array);
            if(map.containsKey(s1)){
                map.get(s1).add(s);
            }else{
                List<String> l = new LinkedList<>();
                l.add(s);
                map.put(s1,l);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] s = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ss = groupAnagrams(s);
        System.out.println(ss.toString());
    }
}
