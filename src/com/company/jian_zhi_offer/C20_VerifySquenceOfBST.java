package com.company.jian_zhi_offer;

import java.util.Arrays;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 *
 * 二叉搜索树，左子树的值小于根节点，根节点小于右子树
 * */
public class C20_VerifySquenceOfBST {
    public static boolean VerifyChildSequenceOfBST(int [] sequence){
        int m = sequence.length;
        if(m <= 2)return true;
        int root = sequence[m - 1];// 整个树的根节点
        int i;
        int j = m - 1;//j表示右子树起始的索引，初始值假设不存在右子树
        // 单侧树，全部在左侧，j = m - 1,全部在右侧，j=0
        Boolean left = true;
        for(i = 0;i < m - 1;i ++){
            if(sequence[i] > root && left){
                left = false;
                j = i;
            }else if(sequence[i] < root && !left){
                return false;
            }
        }
        left = VerifyChildSequenceOfBST(Arrays.copyOfRange(sequence,0,j));
        Boolean right = VerifyChildSequenceOfBST(Arrays.copyOfRange(sequence,j,m - 1));
        return left && right;
    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        int m = sequence.length;
        if(m == 0)return false;//空数组不是任何二叉搜索树，但是直接这样写会导致后面递归出错
        if(m <= 2)return true;
        return VerifyChildSequenceOfBST(sequence);
    }

    public static void main(String[] args){
        System.out.println(VerifySquenceOfBST(new int[]{5,7,6,9,11,10,8}));

    }
}
