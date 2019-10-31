package com.company.java.door._1_basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Arrays.asList()是泛型方法，传入的对象必须是对象数组。
 * 也就是说传入原生类型数组是不行的
 * */
public class Test5 {
    public static void main(String[] args){
        String[] muArray = {"apple","banana"};
        List<String> myList = Arrays.asList(muArray);
        List<String> myList1 = Arrays.asList("apple","banana");
        System.out.println(myList);//[apple,banana]
        System.out.println(myList1);
        System.out.println(myList.size());//2
        System.out.println(myList1.size());//2
//        List myList = Arrays.asList(1,2,3);
        int[] myArray = {1,2,3};
        List myList2 = Arrays.asList(myArray);
        System.out.println(myList2.size());//1
        System.out.println(myList2.get(0));//数组地址
        int[] array = (int[]) myList2.get(0);
        System.out.println(Arrays.toString(array));//[1,2,3]
//        当传入一个原生数据类型数组时，Arrays.asList() 的真正得到的参数就不是数组中的元素，而是数组对象本身！此时List 的唯一元素就是这个数组，这也就解释了上面的代码

//        包装类型数组就可以解决这个问题
        Integer[] myArray3 = {1,2,3};
        List myList3 = Arrays.asList(myArray3);
        System.out.println(myList3.size());//3
        System.out.println(myList3.get(0));//1
//        Arrays.asList() 方法返回的并不是 java.util.ArrayList ，而是 java.util.Arrays 的一个内部类,这个内部类并没有实现集合的修改方法或者说并没有重写这些方法。

//        myList3.add(4);//不能执行修改的方法

        /**
         * 如何正确将数组转换为ArrayList
         * */
        List list = new ArrayList(Arrays.asList(myArray3));
        System.out.println(list.size());//3
        System.out.println(list.get(0));//1
        list.add(4);//
        System.out.println(list.size());//4




    }
}
