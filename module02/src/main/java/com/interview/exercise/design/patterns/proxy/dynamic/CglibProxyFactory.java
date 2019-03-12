package com.interview.exercise.design.patterns.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author chenpeiqiang
 * @describtion 这里需要使用cglib包,这里也是一个工具类，用户产生用户需要的代理对象，
 * @date 2019/03/12
 */
public class CglibProxyFactory implements MethodInterceptor {

    /**
     * 目标对象
     */
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib动态代理前置");
        Object obj = method.invoke(target,objects);
        System.out.println("Cglib动态代理后置");

        return obj;
    }
}