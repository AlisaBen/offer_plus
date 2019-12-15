package com.company.leetcode.week8.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * */
public class _118_generate {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 1)return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        if(numRows == 1){
            res.add(1);
            result.add(res);
            return result;
        }
        result = generate(numRows - 1);
        if(result.size() >= 1){
            List<Integer> last = result.get(result.size() - 1);
            for(int i = 0;i < last.size();i++){
                if(i == 0)res.add(1);
                else res.add(last.get(i) + last.get(i - 1));
            }
            res.add(1);
            result.add(res);
        }

        return result;
    }
}
