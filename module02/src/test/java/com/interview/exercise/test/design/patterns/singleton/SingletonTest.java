package com.interview.exercise.test.design.patterns.singleton;

import com.interview.exercise.design.patterns.singleton.register.LazyRegisterSingleton;
import com.interview.exercise.design.patterns.singleton.register.SubSingleton;
import com.interview.exercise.design.patterns.singleton.register.SubSingleton2;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public class SingletonTest {

    /**
     * 单例攻击
     */
    @Test
    public void attackSingleton() {
        try {
            Class clazz = LazyRegisterSingleton.class;
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            LazyRegisterSingleton registerSingleton = (LazyRegisterSingleton) constructor.newInstance();
            System.out.println(registerSingleton);
            System.out.println("====================================");
            LazyRegisterSingleton registerSingleton1 = LazyRegisterSingleton.getBean();
            System.out.println(registerSingleton1);
            LazyRegisterSingleton registerSingleton2 = LazyRegisterSingleton.getBean();
            System.out.println(registerSingleton2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRegisterSingleton() {
        System.out.println(LazyRegisterSingleton.getBean());

    }

    @Test
    public void testSingleton() {

//        System.out.println(SubSingleton.getBean());
        int i = 100;
        for (int i1 = 0; i1 < i; i1++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SubSingleton.getBean());

                }
            }).start();
        }
    }

    @Test
    public void testRegisterSingletonFullName() {

        int i = 100;
        for (int i1 = 0; i1 < i; i1++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SubSingleton.getBean("com.interview.exercise.design.patterns.singleton.register.SubSingleton"));
                }
            }).start();
        }
    }

    @Test
    public void testRegisterSingletonWithMessage() {
        System.out.println(SubSingleton2.getBean());
    }

}