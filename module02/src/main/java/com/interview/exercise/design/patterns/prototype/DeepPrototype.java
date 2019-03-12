package com.interview.exercise.design.patterns.prototype;

import java.util.Date;

/**
 * @author chenpeiqiang
 * @describtion 克隆对象
 * @date 2019/03/11
 */
public class DeepPrototype implements Cloneable {

    /**
     * nama
     */
    private String name;

    /**
     * age
     */
    private int age;

    /**
     * birthday
     */
    private Date birthday;

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

    /**
     * 克隆方法，要求深克隆
     * 深克隆：引用数据类型，要重新创建对象
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public DeepPrototype clone() throws CloneNotSupportedException {

        /**
         * 使用超类中大浅复制完成基本数据类型的复制
         */
        DeepPrototype clone = (DeepPrototype)super.clone();
        /**
         * 使用引用对象大clone，复制出一份引用对象，而不是引用对象的地址值。
         */
        clone.setBirthday((Date) birthday.clone());

        return clone;
    }
}