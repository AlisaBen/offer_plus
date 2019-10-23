package com.company.java.door;

public class Test2 {
    public static void main(String[] args){
        try {
            int a = 4 / 0;

        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException e1){
            System.out.println(e1);
        }finally {
            System.out.println("gg");
        }
    }
}
