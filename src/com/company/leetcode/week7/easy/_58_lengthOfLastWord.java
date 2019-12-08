package com.company.leetcode.week7.easy;

/**
 * created by Arya on 2019.12.7 15:31
 * 最后一个单词的长度
 * */
public class _58_lengthOfLastWord {
    /**
     * 这个方法不是很好，因为split API会将整个字符串都进行SPLIT
     * 而实际上，我们只需要最后一个
     * */
    public int lengthOfLastWord(String s) {
        String[] ls = s.split(" ");
        if(ls.length == 0)return 0;
        return ls[ls.length - 1].length();
    }
    public int lengthOfLastWord1(String s) {
        if(s == null || s.length() == 0)return 0;
        int j = s.length() - 1;//从后向前遍历
        for(;j >= 0;j--){
            if(s.charAt(j) != ' '){
                break;
            }
        }
        //这是j指向第一个不为空格的字母
        int i = j;
        for(;i >= 0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
        }
        return j - i;
    }
}
