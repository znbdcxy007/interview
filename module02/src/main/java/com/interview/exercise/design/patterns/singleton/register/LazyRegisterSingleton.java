package com.interview.exercise.design.patterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenpeiqiang
 * @describtion 注册式单例
 * @date 2019/03/08
 */
public class LazyRegisterSingleton {

    /**
     * 注册单例使用Map缓存
     */
    private static final Map<String, Object> registerMap = new ConcurrentHashMap<>();

    /**
     * 攻击标志
     */
    private static boolean isInit = false;

    private LazyRegisterSingleton() {
        synchronized (LazyRegisterSingleton.class){
            if (!isInit) {
                isInit = !isInit;
            }else {
                throw new RuntimeException("单例攻击！");
            }
        }
    }

    /**
     * 前提是又一个名字，然后那这个名字去注册缓存中查找实例，没有就向缓存中添加对象
     * 这个能保证是单例，但不能保证是同一个对象。
     * @return
     */
    public static LazyRegisterSingleton getBean(){
        String name = LazyRegisterSingleton.class.getName();
        if(!registerMap.containsKey(name)){
            synchronized (registerMap){
                if (!registerMap.containsKey(name)) {
                    LazyRegisterSingleton bean = new LazyRegisterSingleton();
                    registerMap.put(name,bean);
                }
            }
        }
        return (LazyRegisterSingleton)registerMap.get(name);
    }

}