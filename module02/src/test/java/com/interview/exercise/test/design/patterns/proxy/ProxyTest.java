package com.interview.exercise.test.design.patterns.proxy;

import com.interview.exercise.design.patterns.proxy.UserMessage;
import com.interview.exercise.design.patterns.proxy.UserMessageImpl;
import com.interview.exercise.design.patterns.proxy.dynamic.CglibProxyFactory;
import com.interview.exercise.design.patterns.proxy.dynamic.JDKProxyFactory;
import com.interview.exercise.design.patterns.proxy.sta.StaticProxy;
import org.junit.Test;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/12
 */
public class ProxyTest {
    @Test
    public void testStaticProxy(){

        UserMessageImpl userMessage = new UserMessageImpl();
        StaticProxy staticProxy = new StaticProxy(userMessage);
        staticProxy.insertUser("name");
        staticProxy.deleteUser("name");
        staticProxy.selectUser("name");
    }

    @Test
    public void testJDKProxy(){

        UserMessageImpl userMessage = new UserMessageImpl();
        UserMessage jdkProxy = (UserMessage) new JDKProxyFactory(userMessage).getProxy();
        jdkProxy.insertUser("name");
        jdkProxy.deleteUser("name");
        jdkProxy.selectUser("name");
    }

    @Test
    public void testCglibProxy(){
        UserMessage userMessage = (UserMessage)new CglibProxyFactory(new UserMessageImpl()).getProxy();
        userMessage.selectUser("aa");
        userMessage.deleteUser("bb");
        userMessage.insertUser("cc");
    }
}