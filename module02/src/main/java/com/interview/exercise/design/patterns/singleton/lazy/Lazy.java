package com.interview.exercise.design.patterns.singleton.lazy;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/07
 */
public class Lazy {

    /**
     * 懒汉式
     */
    private static Lazy bean = null;

    /**
     * 私有构造函数
     */
    private Lazy() { }

    /**
     * 获取对象：存在线程安全问题
     * @return
     */
    public static Lazy getBean() {
        if (bean == null) {
            bean = new Lazy();
        }
        return bean;
    }
}