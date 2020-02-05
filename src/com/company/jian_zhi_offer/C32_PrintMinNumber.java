package com.company.jian_zhi_offer;
import java.util.ArrayList;
import java.util.Arrays;

public class C32_PrintMinNumber {
    public static String PrintMinNumber(int [] numbers) {
        if (numbers.length == 0) return "";
        Arrays.sort(numbers);
        String result = String.valueOf(numbers[0]);
        if (numbers.length == 1) return result;
        // Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        for (int i = 1; i < numbers.length;i ++ ) {
            String tmp = String.valueOf(numbers[i]);
            String s1 = result.concat(tmp);
            String s2 = tmp.concat(result);
            result = s1.compareTo(s2) > 0 ? s2 : s1;
        }
        return result;
 

    }
    public static void main(String[] args) {
        int [] a = {3,5,1,4,2};
        String res = PrintMinNumber(a);
        System.out.println(res);
    }
}