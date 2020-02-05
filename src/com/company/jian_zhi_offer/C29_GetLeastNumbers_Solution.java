package com.company.jian_zhi_offer;
import java.util.ArrayList;
public class C29_GetLeastNumbers_Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || k <= 0 || k > input.length) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer value: input) {
            if (result.size() == 0) {
                result.add(value);
            } else {
                for(int i = result.size() - 1;i >= 0;i--){
                    if (result.get(i) <= value){
                        result.add(i + 1, value);
                        break;
                    } else if (i == 0) {
                        result.add(0, value);
                    }
                }
                if(result.size() > k) {
                    result.remove(k);
                }
            }

        }
        return result;

    }
    public static void main(String[] args) {
        int[] a = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> res = GetLeastNumbers_Solution(a, 8);
        System.out.println(res);
    }
}