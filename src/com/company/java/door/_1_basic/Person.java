package com.company.java.door._1_basic;

import java.util.Comparator;

/**
 * created by Arya on 2019/11/6 12:18
 * compareTo
 * */
public class Person implements Comparable<Person> {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
//        return this.age > o.getAge() ? 1 : (this.age == o.getAge() ? 0 : -1);//从小到大
        return this.age > o.getAge() ? -1 : (this.age == o.getAge() ? 0 : 1);//从大到小
    }
}
