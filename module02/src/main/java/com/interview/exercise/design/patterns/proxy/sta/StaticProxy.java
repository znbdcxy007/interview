package com.interview.exercise.design.patterns.proxy.sta;

import com.interview.exercise.design.patterns.proxy.UserMessage;

/**
 * @author chenpeiqiang
 * @describtion 静态代理，目标对象有几个方法，就需要手动代码几个方法。
 * @date 2019/03/12
 */
public class StaticProxy implements UserMessage {

    /**
     * 目标对象
     */
    private UserMessage targer;

    public StaticProxy(UserMessage targer) {
        this.targer = targer;
    }

    /**
     * 对目标对象进行扩展，然后调用目标对象
     * @param name
     */
    @Override
    public void insertUser(String name) {
        System.out.println("前置通知");
        targer.insertUser(name);
        System.out.println("后置通知");

    }

    @Override
    public void deleteUser(String name) {
        System.out.println("前置通知");
        targer.deleteUser(name);
        System.out.println("后置通知");
    }

    @Override
    public void selectUser(String name) {
        System.out.println("前置通知");
        targer.selectUser(name);
        System.out.println("后置通知");
    }
}