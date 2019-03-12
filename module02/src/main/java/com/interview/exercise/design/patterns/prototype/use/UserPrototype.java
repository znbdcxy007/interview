package com.interview.exercise.design.patterns.prototype.use;

import java.util.Date;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/12
 */
public class UserPrototype {

    private String name;
    private Integer age;
    private String sex;
    private String adderss;
    private Date brith;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public Date getBrith() {
        return brith;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public  User clone() throws CloneNotSupportedException {
        User user = new User();
        user.setName(this.name);
        user.setAdderss(this.adderss);
        user.setAge(this.age);
        user.setSex(this.sex);
        user.setBrith(this.brith);
        return user;
    }

    @Override
    public String toString() {
        return "UserPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", adderss='" + adderss + '\'' +
                ", brith=" + brith +
                '}';
    }
}