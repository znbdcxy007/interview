package com.interview.exercise.design.patterns.proxy;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/12
 */
public interface UserMessage {

    /**
     * 添加用户
     */
    void insertUser(String name);

    /**
     * 删除用户
     */
    void deleteUser(String name);

    /**
     * 查询用户
     */
    void selectUser(String name);

}