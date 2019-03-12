package com.interview.exercise.design.patterns.singleton.register;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenpeiqiang
 * @describtion 超级父类，确保子类实例是单例，
 * @date 2019/03/09
 */
public abstract class SuperSingleton {

    public static final Map<String,SuperSingleton> registryMap = new HashMap<>();

    /**
     * 构造函数protected，只允许子类访问
     * @throws MyException
     */
    SuperSingleton() throws MyException {
        String name = this.getClass().getName();

        if (registryMap.containsKey(name)) {
            throw new MyException("单实例侵犯异常");
        }else{
            synchronized (registryMap){
                if (registryMap.containsKey(name)) {
                    throw new MyException("单实例侵犯异常");
                } else{
                    registryMap.put(name,this);
                }
            }
        }
    }

    /**
     * 获取集合中单例，如果结合中没有，就注册单例，然后返回
     */
    public static <T extends SuperSingleton> T getBean(Class<T> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String  name = clazz.getName();
        if (!registryMap.containsKey(name)) {
            synchronized (registryMap){
                if (!registryMap.containsKey(name)) {
                    /**
                     * 传进来的是什么类型的Class，创建的就是对应类型的对象
                     */
                    return clazz.getConstructor().newInstance();
                }
            }
        }
        return (T)registryMap.get(name);
    }

    /**
     * 获取集合中的单例，根据全路径类名获取
     */
    public static <T extends SuperSingleton> T getBean (String fullPath) throws MyException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (fullPath == null) {
            throw new MyException("类名不能为null！");
        }
        String name = fullPath;

        if(!registryMap.containsKey(name)){
            /**
             * 根据全路径类名得到的Class对象类型是我们不能保证的
             * 需要将得到的Class对象转成我们目标对象的子类，这样才能使用
             */
            Class<? extends SuperSingleton> clazz = Class.forName(name).asSubclass(SuperSingleton.class);
            synchronized (registryMap){
                if(!registryMap.containsKey(name)){
                    /**
                     * 因为上面通过asSubClass()函数已经将Class类转成了SuperSingleton子类，
                     * 所以这里创建的对象，就直接使用SuperSingleton接收
                     */
                    return (T)clazz.newInstance();
                }
            }
        }
        return (T)registryMap.get(name);
    }

    /**
     * 带参数的构造方法
     * @param <T>
     * @return
     */
    public static <T extends SuperSingleton> T getBean(Class<T> clazz,Class<?>[] parameterTypes,Object[] parameters) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String name = clazz.getName();
        if (!registryMap.containsKey(name)) {
            synchronized (registryMap){
                if (!registryMap.containsKey(name)) {
                    /**
                     * 带参数构造函数，
                     */
                    Constructor<T> constructor = clazz.getConstructor(parameterTypes);
                    return constructor.newInstance(parameters);
                }
            }
        }
        return (T)registryMap.get(name);
    }

    /**
     * 自定义异常
     */
    static class MyException extends Exception{

        public MyException(String message) {
            super(message);
        }
    }
}