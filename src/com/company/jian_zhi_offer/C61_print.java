package com.company.jian_zhi_offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import com.company.jian_zhi_offer.base_package.*;


/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class C61_print {
    static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if (pRoot == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        queue.add(null);
        ArrayList<ArrayList<Integer>> result =  new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node != null) {
                
                tmp.add(node.val);
   
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            } else{
                ArrayList<Integer> a = (ArrayList<Integer>) tmp.clone();
                result.add(a);
                tmp.clear();
                if (queue.isEmpty()) return result;
                queue.add(null);
            } 
        }
        return result;

    
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2= new TreeNode(2);
        node1.left = node2;
        ArrayList<ArrayList<Integer>> a = Print(node1);
        System.out.println(a);
    }
    
}