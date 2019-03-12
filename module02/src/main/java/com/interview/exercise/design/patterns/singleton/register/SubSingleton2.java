package com.interview.exercise.design.patterns.singleton.register;

import java.lang.reflect.InvocationTargetException;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/09
 */
public class SubSingleton2 extends SuperSingleton {

    /**
     * 构造函数protected，只允许子类访问
     *
     * @throws MyException
     */
    public SubSingleton2() throws MyException {
        super();
    }

    /**
     * 用户名称
     */
    private String name;

    public SubSingleton2(String name) throws MyException {
        super();
        this.name = name;
    }

    /**
     * 获取对象
     */
    public static SubSingleton2 getBean(){
        Class[] clazzs = new Class[]{String.class};
        Object[] paramters = new Object[]{"Test"};
        try {
            return SuperSingleton.getBean(SubSingleton2.class,clazzs,paramters);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}