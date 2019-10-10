package com.company.jian_zhi_offer.tree;

import com.company.jian_zhi_offer.base_package.TreeNode;

import java.util.Arrays;
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * */
public class C7_ReConstructBinaryTree  {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length== 0)return null;
        TreeNode root = new TreeNode(pre[0]);//根节点
        int root_idx = 0;
//        int root_idx = in.asList().indexOf(pre[0]);
        for(int idx = 0;idx < in.length;idx++){
            if(in[idx] == pre[0]){
                root_idx = idx;
                break;
            }
        }
        TreeNode left_tree = reConstructBinaryTree(
                Arrays.copyOfRange(pre,1,root_idx + 1),
                Arrays.copyOfRange(in,0,root_idx)
        );
        TreeNode right_tree = reConstructBinaryTree(
                Arrays.copyOfRange(pre,root_idx + 1,pre.length),
                Arrays.copyOfRange(in,root_idx + 1,in.length)
        );
        root.left = left_tree;
        root.right = right_tree;
        return root;
    }
}
