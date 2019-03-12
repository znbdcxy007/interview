package com.interview.exercise.thread.lcdl;

import java.util.concurrent.*;

/**
 * @describtion
 * @author chenpeiqiang
 * @date 2019/03/07
 */
public class UseCountDownLatch {

    public static void main( String[] args ){
        new UseCountDownLatch().getStart();
    }

    /**
     * 创建线程计数器，设置线程数，然后调用
     * 创建三个员工，然他去工作去。创建一个老板，让他去检查去
     */
    public void getStart(){

        /**
         * 线程计数器
         */
        CountDownLatch latch = new CountDownLatch(3);

        /**
         * 创建任务对象
         */
        WorkOperate laoWang = new WorkOperate("老王", latch);
        WorkOperate laoLi = new WorkOperate("老李", latch);
        WorkOperate laoZhao = new WorkOperate("老赵", latch);
        BossOperate boss = new BossOperate("老板", latch);

        /**
         * 创建线程，将任务提交给线程去执行
         * 这里的执行是异步执行的，不是同步
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(laoLi);
        executorService.execute(laoWang);
        executorService.execute(laoZhao);
        executorService.execute(boss);

        executorService.shutdown();

    }
}