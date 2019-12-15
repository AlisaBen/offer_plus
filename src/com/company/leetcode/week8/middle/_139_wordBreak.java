package com.company.leetcode.week8.middle;

import java.util.*;

public class _139_wordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
//        return word_break(s,new HashSet<>(wordDict),0);
        return word_break1(s,new HashSet<>(wordDict),0,new Boolean[s.length()]);
    }

    public static boolean wordBreak1(String s, List<String> wordDict) {
        Set<String> wordDivtSet = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        int[] visit = new int[s.length()];
        ((LinkedList<Integer>) queue).add(0);
        while (!queue.isEmpty()){
            int start = queue.remove();
            if(visit[start] == 0){
                for(int end = start + 1;end <= s.length();end++){//对于start后面的每个可以算作一个单词的end都入队，这样就可以指导
                    if(wordDivtSet.contains(s.substring(start,end))){
                        ((LinkedList<Integer>) queue).add(end);
                        if(end == s.length()){
                            return true;
                        }
                    }
                }
                visit[start] = 1;
            }
        }
        return false;
    }

    //超出时间限制
    public static boolean word_break(String s,HashSet<String> set,int start){
        if(s.length() == start)return true;
        for(int end = start + 1;end <= s.length();end++){
            if(set.contains(s.substring(start,end)) && word_break(s,set,end)){
                return true;
            }
        }
        return false;
    }

    //超出时间限制，官方题解说这个方法优化了，并不认同
    public static boolean word_break1(String s,HashSet<String> set,int start,Boolean[] memo){
        System.out.println(Arrays.toString(memo));
        if(s.length() == start)return true;
        if(memo[start] != null)return memo[start];
        for(int end = start + 1;end <= s.length();end++){
            if(set.contains(s.substring(start,end)) && word_break1(s,set,end,memo)){
                return memo[start] = true;
            }
        }
        return false;
    }

    public static boolean wordBreak2(String s, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for(int i = 1;i <= s.length();i++){
            for(int j = 0;j < i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[dp.length - 1];

    }



}
