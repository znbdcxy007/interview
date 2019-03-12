package com.interview.exercise.design.patterns.singleton.hungry;

/**
 * @author chenpeiqiang
 * @describtion 饿汉式
 * @date 2019/03/07
 */
public class Hungry {

    /**
     * 饿汉式：不存在线程安全问题
     */
    private static final Hungry bean = new Hungry();

    /**
     * 私有构造函数
     */
    private Hungry() {
        synchronized (Hungry.class){
            if (bean != null) {
                throw new RuntimeException("单例攻击！");
            }
        }
    }

    /**
     * 获取对象方式
     * @return
     */
    public static Hungry getBean() {
        return bean;
    }
}