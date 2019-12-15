package com.company.leetcode.week8.easy;

public class _122_maxProfit {
    public static int maxProfit(int[] prices) {
        if(prices.length == 0)return 0;
        int accomProfit = 0;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i = 1;i < prices.length;i++){
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }else{
                System.out.println("===="+accomProfit);
                minPrice = prices[i];
                accomProfit += maxProfit;
                maxProfit = 0;
            }
        }
        accomProfit += maxProfit;
        return accomProfit;

    }
    public static void main(String[] args){
        int res = maxProfit(new int[]{1,2,3,4,5});
        System.out.println(res);

    }
}
