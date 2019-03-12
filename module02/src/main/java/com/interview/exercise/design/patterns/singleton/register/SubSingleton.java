package com.interview.exercise.design.patterns.singleton.register;

import java.lang.reflect.InvocationTargetException;

/**
 * @author chenpeiqiang
 * @describtion 单例子类
 * @date 2019/03/09
 */
public class SubSingleton extends SuperSingleton{


    /**
     * 构造函数protected，只允许子类访问
     *
     * @throws MyException
     */
    public SubSingleton() throws MyException {
        super();
    }
    
    /**
     * 获取单例对象:通过类对象
     */
    public static SubSingleton getBean(){
        try {
            return SuperSingleton.getBean(SubSingleton.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取单例对象：铜鼓全路径类名
     */
    public static SubSingleton getBean(String name){
        try {
            return SuperSingleton.getBean(name);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}