package com.interview.exercise.reflex;

/**
 * @author chenpeiqiang
 * @describtion 反射类：属性，构造方法，方法
 * @date 2019/03/08
 */
public class TargetClass {

    /**
     * 年龄
     */
    private int age;

    /**
     * 姓名
     */
    private String name = "name11";

    /**
     * address
     */
    public String address = "address11";


    /**
     * 无参构造
     */
    public TargetClass() {
    }

    /**
     * 有参构造
     *
     * @param age
     * @param name
     */
    public TargetClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}