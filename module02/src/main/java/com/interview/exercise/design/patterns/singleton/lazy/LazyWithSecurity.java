package com.interview.exercise.design.patterns.singleton.lazy;

/**
 * @author chenpeiqiang
 * @describtion 懒加载线程安全处理
 * @date 2019/03/07
 */
public class LazyWithSecurity {

    /**
     * 懒加载
     */
    private static LazyWithSecurity bean = null;

    /**
     * 方法私有化
     * 反射单例攻击
     */
    private LazyWithSecurity() {

        if(bean != null){
            throw new RuntimeException("单例攻击");
        }
    }

    /**
     * 获取单例
     * 这种同步方式比在整个方法上加synchronized效率高，因为判null减少了获取锁资源的资源消耗
     *
     * @return
     */
    public static LazyWithSecurity getBean() {
        if (bean == null) {//判断非空，直接返回，否则获取锁(消耗资源)，
            synchronized (LazyWithSecurity.class){
                if (bean == null) {//重复判断，防止重复创建对象
                    bean = new LazyWithSecurity();
                }
            }
        }
        return bean;
    }
}