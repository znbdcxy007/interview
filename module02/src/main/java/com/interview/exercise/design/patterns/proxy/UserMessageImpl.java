package com.interview.exercise.design.patterns.proxy;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/12
 */
public class UserMessageImpl implements UserMessage {

    @Override
    public void insertUser(String name) {
        System.out.println("添加了一个用户");

    }

    @Override
    public void deleteUser(String name) {
        System.out.println("删除了一个用户");
    }

    @Override
    public void selectUser(String name) {
        System.out.println("得到了一个用户");
    }
}