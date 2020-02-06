package com.company.jian_zhi_offer;
/**
 * 
 * & 只要有0，就是0
 * ^ 只要不一样就是1
 * >> n 右移n位
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class C41_FindNumsAppearOnce {
    public static int findFirst1Position(int result) {
        // 找到第一个1的位置
        if (result == 0) return -1;
        // result不为0,循环和1与之后右移一位，如果result不为0，和1与之后为0，说明这一位就是为1的那位
        int index = 0; // 默认从第一位开始

        while ((result & 1) == 0) { // 只有为0的时候，结果为0，否则结果不为0
            result = result >> 1;
            index ++;
        }
        return index;
    }
    public static boolean isBits(int value, int moveNum) {
        value = value >> moveNum; // 右移这么多位
        value &= 1;
        return value == 0; // 
    }
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length <= 2) return ;
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result ^= array[i];
        }
        int pos = findFirst1Position(result); // pos减一
        // System.out.println("pos:" + pos);
        for (int i = 0; i < array.length; i++) {
            System.out.println(isBits(array[i], pos));
            if (isBits(array[i], pos)) {
                // 第pos位是1
                
                num1[0] ^= array[i];
            } else {
                // 第pos位不是1
                num2[0] ^= array[i];
            }
        }
        // System.out.println(num1[0] + ":" +num2[0]);

        
    }
    public static void main(String[] args) {
        int a = 13;
        a = a >> 2;
        int b = 11;
        b = b >> 2;
        int[] c = {1, 1,2,3,3,2,4};
        int[] d = {0};
        int[] e = {0};
        FindNumsAppearOnce(c, d, e);
        System.out.println(d);

        System.out.println(a & 1);
        System.out.println(b & 1);
        System.out.println(1 ^ 0);
    }

}