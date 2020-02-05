package com.company.jian_zhi_offer;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;
public class C27_Permutation {
    public static void swap(char[] strs, int i,int j) {
        char tmp = strs[i];
        strs[i] = strs[j];
        strs[j] = tmp;
    }
    public static void Permutation(char[] strs, int begin, TreeSet<String> result) {
        if (strs == null || strs.length == 0 || begin < 0 || begin >= strs.length) return ;
        if (begin == strs.length - 1) {
            result.add(String.valueOf(strs));
            // System.out.println("begin: " + begin + "        result: "+result + "      chars: " + strs);
        } else {
            for(int i = begin; i < strs.length; i++ ){
                swap(strs, begin, i);
                // System.out.println("i:"+i + "         begin: " + begin + "        result: "+result + "      chars: " + strs);
                Permutation(strs,begin + 1,result);
                swap(strs, i, begin);
            }

        }
    }
    public static ArrayList<String> Permutation(String str) {
        if (str.length() == 0) return new ArrayList<>();
        if (str == null || str.length() == 1) return new ArrayList<>(Arrays.asList(str));
        ArrayList<String> result = new ArrayList<>();
        TreeSet<String> tmp = new TreeSet<>();
        char[] strs = str.toCharArray();
        Permutation(strs, 0, tmp);
        result.addAll(tmp);
        return result;
    }
    public static void main(String[] args) {
        String s = "";
        // System.out.println(Arrays.asList(s));
        ArrayList<String> res = Permutation(s);

        System.out.println(res);
    }
}
