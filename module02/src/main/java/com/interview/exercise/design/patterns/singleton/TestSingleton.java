package com.interview.exercise.design.patterns.singleton;

import com.interview.exercise.design.patterns.singleton.enums.EnumSignleton;
import com.interview.exercise.design.patterns.singleton.serializable.SeriableSingleton;

import java.io.*;
import java.util.concurrent.CountDownLatch;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/08
 */
public class TestSingleton {

    public static void main( String[] args ){

//        getSingletonBean();

        getSeriaBean();
    }

    /**
     * 序列化单例
     */
    private static void getSeriaBean(){
        /**
         * 获取单例
         */
        SeriableSingleton bean = SeriableSingleton.getBean();

        try {
            /**
             * 定义流工具和目的地,
             */
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("singleton.obj"));
            /**
             * 向目的地传输数据
             */
            objectOutput.writeObject(bean);

            /**
             * 关闭资源
             */
            objectOutput.flush();
            objectOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * 反序列化得到的object
         */
        SeriableSingleton resultBean = null;
        try {
            /**
             * 定义流工具和数据来源
             */
            ObjectInput objectInput = new ObjectInputStream(new FileInputStream("singleton.obj"));
            resultBean = (SeriableSingleton)objectInput.readObject();
            /**
             * 关闭资源
             */
            objectInput.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * 比较两对象的地址值
         */
        System.out.println(bean == resultBean);
    }


    /**
     * 非序列化单例
     */
    private static void getSingletonBean() {
        int num = 100;
        final CountDownLatch countDownLatch = new CountDownLatch(num);

        long start = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    System.out.println(LazyInnerStaticClass.getBean());
//                    System.out.println(LazyWithSecurity.getBean());
//                    System.out.println(LazyRegisterSingleton.getBean(null));
                    System.out.println(EnumSignleton.SIGNLETON_01);
                    countDownLatch.countDown();

                }
            }).start();
        }
        try {
            countDownLatch.await();
            long end = System.currentTimeMillis();
            System.out.println("耗时："+(end-start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}