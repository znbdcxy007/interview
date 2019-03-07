package com.interview.exercise.thread.synchronize;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/06
 */
public class DuiXiangSuo {

    public static void main( String[] args ){
        new DuiXiangSuo().getLocal();
    }

    /**
     * 调用对象锁
     */
    public void getLocal(){
        /**
         * 对象资源，同时也是对象锁
         */
        Account jackAccount = new Account(1000, "jack");

        /**
         * 线程要执行的任务，指定对象
         */
        ThreadOperator operator = new ThreadOperator(jackAccount);

        /**
         * new出几个线程对象，去执行定义好的线程任务，
         */
        final int thread_num = 6;
        Thread[] threads = new Thread[thread_num];
        for (int i = 0; i < thread_num; i++) {
            threads[i] = new Thread(operator,"线程"+i);
            threads[i].start();
        }

    }

    /**
     * 每条线程应该执行的任务或者说操作步骤，即每条线程执行的内容都一样
     * 在执行的任务中指定对象锁
     */
    class ThreadOperator implements Runnable{

        private Account account;

        public ThreadOperator(Account objectLock) {
            this.account = objectLock;
        }

        @Override
        public void run() {
            synchronized (account){
                account.delNum(10);
                System.out.println(Thread.currentThread().getName()+account.num);
            }
        }
    }

    /**
     * 锁对象，锁住的是对象中对应的资源
     */
    class Account{
        private int num;

        private String name;

        public Account(int num, String name) {
            this.num = num;
            this.name = name;
        }

        /**
         * 涨钱
         */
        public void addNum(int amount){
            num+=amount;
        }

        /**
         * 减钱
         */
        public void delNum(int amount){
            num-=amount;
        }

        /**
         * 获取账户信息
         */
        public int getNum(){
            return num;
        }
    }

}