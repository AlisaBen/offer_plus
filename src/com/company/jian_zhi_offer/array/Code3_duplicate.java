package com.company.jian_zhi_offer.array;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2或者3。
 * */
public class Code3_duplicate {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        int [] duplicate_numbers = new int[length];
        Boolean flag = false;
        for(int i = 0;i < length;i++){
            if(duplicate_numbers[numbers[i]] == 0){
                duplicate_numbers[numbers[i]] += 1;
            }else{//有可能duplication输入的长度是0
                duplication[0] = numbers[i];
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static boolean duplicate1(int numbers[],int length,int [] duplication) {
        Boolean flag = false;
        int tmp ;
        if(length > 0){

        }
        for(int i = 0; i < length; i++){
            if(numbers[numbers[i]] == length){//重複
                duplication[0] = numbers[i];
                flag = true;
            }else{
                tmp = numbers[numbers[i]];
                numbers[numbers[i]] = length;
                if(numbers[tmp] == length){
                    duplication[0] = numbers[i];
                    flag = true;
                }else{
                    int tmp1 = numbers[tmp];
                    numbers[tmp] = length;
                    tmp = tmp1;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args){
//        int [] a = new int[3];
//        for(int i = 0;i < a.length;i ++){
//            System.out.println(a[i]);
//        }
        System.out.println(duplicate(new int[]{3,4,1,1,2},5,new int[1]));

    }
}
