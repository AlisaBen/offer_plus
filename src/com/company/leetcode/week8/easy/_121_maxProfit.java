package com.company.leetcode.week8.easy;

public class _121_maxProfit {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)return 0;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i = 1;i < prices.length;i++){
            if(prices[i] < minPrice)minPrice = prices[i];
            maxProfit = Math.max(maxProfit,prices[i] - minPrice);
        }
        return maxProfit;


    }
}
