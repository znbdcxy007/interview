package com.interview.exercise.thread.lcdl;

import java.util.concurrent.CountDownLatch;

/**
 * @describtion 老板线程要做的事情
 * @author chenpeiqiang
 * @date 2019/03/07
 */
public class BossOperate implements Runnable{

    /**
     * 老板名称
     */
    private String name;

    /**
     * 程序计数器
     */
    private CountDownLatch _latch;

    public BossOperate(String name, CountDownLatch _latch) {
        this.name = name;
        this._latch = _latch;
    }

    @Override
    public void run() {
        /**
         * 调用老板的工作内容
         */
        doCheck();
    }

    /**
     * boss的工作内容
     */
    public void doCheck(){
        System.out.println("老板要检查员工工作，员工说还没工作完，于是老板就等待员工工作！");
        try {
            _latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("员工工作完了，老板检查员工的工作情况！");
    }
}