package com.interview.exercise.thread.lcdl;

import java.util.concurrent.CountDownLatch;

/**
 * @describtion 工人线程要做的东西
 * @author chenpeiqiang
 * @date 2019/03/07
 */
public class WorkOperate implements Runnable{

    private String name;
    /**
     * 线程计数器
     */
    private CountDownLatch _latch;

    public WorkOperate(String name, CountDownLatch _latch) {
        this.name = name;
        this._latch = _latch;
    }


    @Override
    public void run() {

        /**
         * 调用doWork(),员工工作方法，让工人去工作
         * 每new一个WorkOperate就是一个工人对象，也就是一个线程对象。
         */
        doWork();

        /**
         * 工人做完事情后需要把线程计数器中的个数减一
         * 调用CountDownLatch.countDown()就是线程数减一
         */
        _latch.countDown();

    }

    /**
     * 员工工作方法
     */
    protected void doWork() {

        System.out.println(name+"工人在做事情中");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name +"工人做完事情了！");

    }
}