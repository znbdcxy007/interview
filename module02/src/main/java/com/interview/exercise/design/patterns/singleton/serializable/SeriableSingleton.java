package com.interview.exercise.design.patterns.singleton.serializable;

import java.io.Serializable;

/**
 * @describtion 序列化单例
 *
 * 序列化单例的问题在于，得到单例对象，然后将对象序列化出去之后，在反序列化，得到的就不是同一个单例了、
 * 解决：复写readResolve()方法就可以解决这个问题
 * @author chenpeiqiang
 * @date 2019/03/08
 */
public class SeriableSingleton implements Serializable{

    private static final SeriableSingleton bean = new SeriableSingleton();

    private SeriableSingleton() {
    }

    /**
     * 获取单例
     * @return
     */
    public static SeriableSingleton getBean(){
        return bean;
    }

    /**
     * 解决反序列化后对象非单例问题，该方法由jvm直接调用，
     * @return
     */
    private Object readResolve(){
        return bean;
    }

}