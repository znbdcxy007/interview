package com.interview.exercise.design.patterns.proxy.dynamic;

import com.interview.exercise.design.patterns.proxy.UserMessage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chenpeiqiang
 * @describtion  jdk动态代理，准确说，这个不是代理对象，这个是产生代理对象的工厂
 * @date 2019/03/12
 */
public class JDKProxyFactory {
    /**
     * 目标类
     */
    private Object target;

    public JDKProxyFactory(UserMessage target) {
        this.target = target;
    }

    /**
     * 这个方法不是代理类，而是一个生产代理类的工具，
     * @return
     */
    public Object getProxy(){
        /**
         * 目标对象的类加载器
         * 目标对对象的接口数组
         * 目标对象方法的调用处理
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理前置通知");
                method.invoke(target,args);
                System.out.println("动态代理后置通知");
                return null;
            }
        });
    }

}