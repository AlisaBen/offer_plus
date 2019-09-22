package com.company.jian_zhi_offer;

import com.company.jian_zhi_offer.base_package.TreeNode;
import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.reflect.generics.tree.Tree;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 与子树不同的是，子结构可以是A树的任意一部分
 * */
public class C14_HasSubtree {
    public static void print(String s){
        System.out.println(s);
    }
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null) return false;
        boolean left_has_subtree = false;
        boolean right_has_subtree = false;
        print("--------------------HasSubtree-----------------------");
        if(root1.val != root2.val){
            print(Integer.toString(root1.val) + "---" + Integer.toString(root2.val));
            if (root1.left != null){
                left_has_subtree = HasSubtree(root1.left,root2);
                print("left has tree=" + left_has_subtree);
            }
            if(root2.right != null){
                right_has_subtree = HasSubtree(root1.right,root2);
                print("right has tree=" + left_has_subtree);
            }
            return (left_has_subtree || right_has_subtree);
        }else{
            if(!isSameTree(root1,root2)){
//                print("--------------------HasSubtree no-----------------------");
                if(root1.left != null){
                    left_has_subtree = HasSubtree(root1.left ,root2);
//                    print("left has tree=" + left_has_subtree);

                }
                if(root1.right != null){
                    right_has_subtree = HasSubtree(root1.right,root2);
//                    print("right has tree=" + left_has_subtree);

                }
                return (left_has_subtree || right_has_subtree);
            }else{
                return true;
            }
        }
    }
    public static boolean isSameTree(TreeNode root1,TreeNode root2){
//        print("--------------------isSameTree-----------------------");
        boolean right_same = false;
        boolean left_same = false;
        if(root1.val == root2.val){
            if(root1.left != null && root2.left != null){
                left_same = isSameTree(root1.left,root2.left);
            }else if(root1.left == null && root2.left == null){
                left_same = true;
            }else if(root1.left != null){
                left_same = true;
            }
            if(root1.right != null && root2.right != null){
                right_same = isSameTree(root1.right,root2.right);
            }else if(root1.right == null && root2.right == null){
                right_same = true;
            }else if(root1.right != null){
                right_same = true;
            }
            return (left_same && right_same);
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node9 = new TreeNode(9);
        TreeNode node7 = new TreeNode(7);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node8 = new TreeNode(8);
        TreeNode node8_1 = new TreeNode(8);
        TreeNode node4 = new TreeNode(4);
        TreeNode node7_1 = new TreeNode(7);
        node8.left = node8_1;
        node8_1.left = node9;
        node8_1.right = node2;
        node2.left = node4;
        node2.right = node7;
        node8.right = node7_1;



//        root.left = node2;
//        root.right = node5;
//        node5.right = node3;
//        node2.left = node9;
//        node2.right = node7;
        TreeNode node8_2 = new TreeNode(8);
        TreeNode node2_1 = new TreeNode(2);
        TreeNode node9_1 = new TreeNode(9);
        node8_2.left = node9_1;
        node8_2.right = node2_1;
//        System.out.println(isSameTree(node8_1,node8_2));
        System.out.println(HasSubtree(node8,node8_2));

    }
}
