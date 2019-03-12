package com.interview.exercise.design.patterns.prototype;

import java.util.Date;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/11
 */
public class SimplePrototype implements Cloneable {

    /**
     * name
     */
    private String name;

    /**
     * age
     */
     private int age;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 克隆方法：这里是浅克隆，
     * 浅克隆：
     * 基本数据类型复制值，
     * 引用数据类型复制引用（这里因为复制的是引用，所以会导致修改引用对象中数据，多个对象中的对应数据都改变）
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public SimplePrototype clone() throws CloneNotSupportedException {
        return (SimplePrototype)super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}