package com.interview.exercise.design.patterns.singleton.inneclass;

/**
 * @describtion 静态内部类的单例获取,最高效的单例方式
 * @author chenpeiqiang
 * @date 2019/03/08
 */
public class LazyInnerStaticClass {
    private static Boolean isInit = false;

    private LazyInnerStaticClass() {
        synchronized (LazyInnerStaticClass.class){
            if (!isInit) {
                isInit=!isInit;
            }else{
                throw new RuntimeException("单例被侵犯！");
            }
        }
    }

    /**
     * 获取对象：当调用改方法时，才会加载静态内部类，因此是懒加载
     * @return
     */
    public static LazyInnerStaticClass getBean(){
        return InnerClass.bean;
    }

    /**
     * 静态内部类
     */
    private static class InnerClass{
        public static final LazyInnerStaticClass bean= new LazyInnerStaticClass();
    }
}