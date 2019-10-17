package com.company.leetcode.week1.easy;

import java.util.Stack;

/**
 * created by benyafang on 2019/10/17 23:24
 *两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警
 * 动态规划
 * */
public class _198_rob {
    public static int rob(int[] nums) {
        int len = nums.length;
        if(len == 0)return 0;
        if(len == 1)return nums[0];
        if(len == 2) return nums[0] > nums[1] ? nums[0] : nums[1];
        int res1 = 0;
        int res2 = 0;
        int index1 = 0;
        int index2 = 1;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(nums[0]);
        stack2.push(nums[1]);
        for(int i = 2 ; i < nums.length; i ++){
            if(i - index1 > 1){
                int top1 = stack1.pop();
                int tmp1 = res1 + top1 + nums[i];
                if(i - index2 > 1){
                    int top2 = stack2.pop();
                    int tmp2 = res2 + top2 + nums[i];
                    if(tmp1 > tmp2){
//                        System.out.println("---" + nums[i] + "---");
                        stack1.push(top1);
                        res1 += top1;
                        index1 = i;
                        stack1.push(nums[i]);
                        stack2.push(top2);
                    }else{
//                        System.out.println("---000" + nums[i] + "---");
                        stack1.push(top1);
                        stack2.push(top2);
                        res2 += top2;
                        index2 = i;
                        stack2.push(nums[i]);
                    }
                }else{
                    int top2 = stack2.pop();
                    int tmp2 = res2 + nums[i];
                    if(tmp1 > tmp2){
//                        System.out.println("000" + nums[i] + "---");
                        stack1.push(top1);
                        res1 += top1;
                        index1 = i;
                        stack1.push(nums[i]);
                        stack2.push(top2);
                    }else{
                        if(tmp1 == tmp2){//放两面都一样
                            stack2.push(top2);
                            stack1.push(top1);
                            stack1.push(nums[i]);
                            res1 += top1;
                            index1 = i;
                        }else{
                            //stack2需要弹出一个元素
                            stack1.push(top1);
                            if(top2 > nums[i]){//top2比该元素大，没必要弹出
                                stack2.push(top2);
                                stack1.push(nums[i]);
                                index1 = i;
                                res1 += top1;

                            }else{
                                stack2.push(nums[i]);
                                if(Math.abs(index2 - index1) > 1 || top1 == 0){
                                    stack1.push(top2);
                                    res1 += top1;
                                    index1 = index2;
                                }
                                index2 = i;
                            }
                        }


                    }
                }
            }else{
                int top1 = stack1.pop();
                int tmp1 = res1 + nums[i];
                if(i - index2 > 1){
                    int top2 = stack2.pop();
                    int tmp2 = res2 + top2 + nums[i];
                    if(tmp1 > tmp2){
                        // stack1需要弹出 一个元素
                        stack2.push(top2);
                        if(top1 > nums[i]){//如果需要弹出的元素大，没必要弹出
                            stack1.push(top1);
                            stack2.push(nums[i]);
                            res2 += top2;
                            index2 = i;

                        }else{
                            if(Math.abs(index1 - index2) > 1 || top2 == 0){
                                stack2.push(top1);
                                index2 = index1;
                                res2 += top2;
                            }
                            index1 = i;
//                            System.out.println("===" + nums[i] + "---" + "index1:"+index1 + "top1:" + top1);
                            stack1.push(nums[i]);
                        }

                    }else{
                        //                        System.out.println("===" + nums[i] + "===");
                        stack1.push(top1);
                        stack2.push(top2);
                        res2 += top2;
                        index2 = i;
                        stack2.push(nums[i]);

                    }
                }
            }

        }
//        while (!stack1.empty()){
//            System.out.println(stack1.pop());
//        }
//        System.out.println("--");
//        while (!stack2.empty()){
//            System.out.println(stack2.pop());
//        }
        int top1 = stack1.pop();
        int top2 = stack2.pop();
//        System.out.println("top1:" + top1 + "top2:" + top2 + "res1:"+res1+"res2:"+res2);
        return res1 + top1 > res2 + top2 ? res1 + top1 : res2 + top2;
//        return 0;

    }
    public static int rob1(int[] nums) {
        /**
         * 一个房子f(1) = num[0]
         * 两个房子f(2) = max{nums[0],nums[1]}
         * 第三个房子，抢f(1)+A3;不抢f(2)
         * f(k)表示k个房子最大的钱数
         * f(k) = max(f(k-2) + Ak,f(k-1))
         * */
        int res = 0;
        int preRes = 0;
        for(int x:nums){
            int tmp = res;
            res = Math.max(preRes + x,res);
            preRes = tmp;
        }
        return res;
    }
    public static void main(String[] args){
        int a;
//        System.out.println(a);
        System.out.println(rob1(new int[]{8,2,8,9,2}));
    }
}
