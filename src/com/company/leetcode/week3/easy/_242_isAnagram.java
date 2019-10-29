package com.company.leetcode.week3.easy;

import java.util.HashMap;
import java.util.Map;

public class _242_isAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i =0;i < s.length();i++){
            if(map1.containsKey(s.charAt(i)))map1.put(s.charAt(i),map1.get(s.charAt(i)) + 1);
            else map1.put(s.charAt(i),1);
        }
        for(int i =0;i < t.length();i++){
            if(map2.containsKey(t.charAt(i)))map2.put(t.charAt(i),map2.get(t.charAt(i)) + 1);
            else map2.put(t.charAt(i),1);
        }
        if(map1.size() != map2.size())return false;
        for(Character c:map1.keySet()){
            if(!(map2.containsKey(c) && map1.get(c).equals(map2.get(c))))return false;
        }
        return true;
    }
    public static void main(String[] args){
        boolean result = isAnagram("rat","cat");
        System.out.println(result);
    }
}
