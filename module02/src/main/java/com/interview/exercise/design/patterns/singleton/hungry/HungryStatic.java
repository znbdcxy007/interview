package com.interview.exercise.design.patterns.singleton.hungry;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class HungryStatic {

    private static HungryStatic bean = null;

    static {
        bean = new HungryStatic();
    }

    /**
     * 私有化构造函数
     * 通过反射对单例攻击
     */
    private HungryStatic() {
        synchronized (HungryStatic.class){
            if (bean != null) {
                throw new RuntimeException("单例攻击！");
            }
        }
    }

    /**
     * 获取实例
     */
    public HungryStatic getBean(){
        return bean;
    }
}