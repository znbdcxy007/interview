package com.interview.exercise.thread.synchronize;

/**
 * @author chenpeiqiang
 * @describtion 方法锁
 * @date 2019/03/06
 */
public class MethodSuo {

    public static void main( String[] args ){
        new MethodSuo().getMethod();
    }

    /**
     * 调用方法
     */
    public void getMethod(){
        Account account = new Account();
        ThreadOperator threadOperator = new ThreadOperator(account);
        int thread_num = 6;
        Thread[] threads = new Thread[thread_num];
        for (int i = 0; i < thread_num; i++) {
            threads[i] = new Thread(threadOperator,"ThreadSet"+i);
            threads[i].start();
        }

        ThreadOper threadOper = new ThreadOper(account);
        Thread[] threadbs = new Thread[thread_num];
        for (int i = 0; i < thread_num; i++) {
            threadbs[i] = new Thread(threadOper,"ThreadGet"+i);
            threadbs[i].start();
        }

    }

    class ThreadOperator implements Runnable{

        Account account;
        AccountB accountB;

        public ThreadOperator(Account account) {
            this.account = account;
//            this.accountB = accountB;
        }

        @Override
        public void run() {
            int num = 6;
            for (int i = 0; i < num; i++) {
                try {
                    account.setMessage( 1000,"jack",Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class ThreadOper implements Runnable{
        Account account;
//        AccountB accountB;

        public ThreadOper(Account account) {
            this.account = account;
//            this.accountB = accountB;
        }

        @Override
        public void run() {
            account.getMessage();
//            accountB.getMessage();
        }
    }

    class Account{
        /**
         * 账户金额
         */
         private int num;
         /**
          * 用户名成
          */
         private String name;
         /**
          * jack
          */
         private String jack;


         /**
          * 设置账户信息
          */
         public void setMessage(int num, String jack, String name) throws InterruptedException {
//             synchronized(this){
                 this.num = num;
                 this.jack=jack;
                 Thread.sleep(100);
                 this.name = name;
                 System.out.println("name:" + name + ",jack:" + jack + ",num:" + num);

//             }
         }
         /**
          * 获取用户信息
          */
         public void getMessage(){

             System.out.println("name:" + name + ",jack:" + jack + ",num:" + num);
//             System.out.printf("name:%s,num:%d%n", name, num);
         }
    }

    class AccountB{
        /**
         * 账户金额
         */
         private int num;
         /**
          * 用户名成
          */
         private String name;

         /**
          * jack
          */
         private String jack;


         /**
          * 设置账户信息
          */
         public void setMessage(int num, String jack, String name) throws InterruptedException {
             this.num = num;
             this.jack = jack;
             Thread.sleep(100);
             this.name = name;
         }
         /**
          * 获取用户信息
          */
         public void getMessage(){
             System.out.printf("name:%s,num:%d%n", name, num);
         }
    }
}