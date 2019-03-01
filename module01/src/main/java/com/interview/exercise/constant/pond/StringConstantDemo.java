package com.interview.exercise.constant.pond;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/01
 */
public class StringConstantDemo {
    public static void main(String[] args) {
//        method_intern();
//        addMehod();
//        strWithAdd();
    strCirculation();
    }


    /**
     * intern()：将堆中对象手动放入常量池中
     * jdk1.7前后intern()方法区别
     * 之前是将堆中对象拷贝到常量池
     * 之后是将堆中的引用拷贝到常量池
     */
    public static void method_intern() {
        PerWayIntern();
        LatterWayIntern();
    }

    /**
     * intern()方法在前
     * 将堆内存中的引用放进常量池，
     * 后面的在放入常量会使用这个引用
     */
    private static void PerWayIntern() {
        String strIndex = new String("java");
        String strLast = new String("end");
        String strHeap = strIndex + strLast;

        //返回的是这个对象在堆内存中的引用
        strHeap.intern();
        String strConstant = "javaend";
        System.out.println(strConstant == strHeap);
    }

    /**
     * intern()方法在后
     * 堆内存中的这个引用是没有用的，
     * 因为对内存中已经有了常量值，
     * 之后的常量都会使用那个常量，而不是后面的那个引用
     */
    private static void LatterWayIntern() {
        String strIndex = new String("java");
        String strLast = new String("end");
        String strHeap = strIndex + strLast;
        String strConstant = "javaend";

        //返回的不再是堆内存中的引用，而是常量池中已经有的对象地址
        strHeap.intern();
        System.out.println(strConstant == strHeap);
    }

    /**
     * 静态变量和非静态变量相加比较
     */
    public static void addMehod(){
        strAddMethod();
        strAddFinalMethod();
    }

    /**
     * 和strAddFinalMethod()比较
     * 以为不是一个对象，所以地址不等
     */
    private static void strAddMethod() {
        String strConstant = "abc";
        String strPre = "ab";
        String strLatter = "c";
        String strResult = strPre + strLatter;
        System.out.println(strConstant == strResult);
    }

    /**
     * 和strAddFinalMethod()比较
     * 因为是静态变量，在编译阶段就会直接替换成对应值
     * 编译器会直接将结果赋值
     */
    private static void strAddFinalMethod() {
        String strConstant = "abc";
        final String strPre = "ab";
        final String strLatter = "c";
        String strResult = strPre + strLatter;
        System.out.println(strConstant == strResult);
    }

    /**
     * 字符串相连原理+
     */
    public static void strWithAdd(){
        strConnectWithAdd();
        //这样做会后效率问题

    }
    /**
     * 使用+链接两个字符串:
     */
    private static void strConnectWithAdd(){
        String strPre = "java";
        String strResult = "my"+ strPre;
        System.out.println(strResult);

        //底层操作步骤如下:
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("my").append(strPre);
        String strResult1 = stringBuilder.toString();
        System.out.println(strResult1);

    }

    /**
     * 字符串相连性能问题
     */
    public static void strCirculation(){
        String str = "my";
        int index = 100;
        /**
         * 这里会很浪费性能，
         * 因为每一个循环都会new一个StringBuilder对象，
         * 之后将StringBuilder对象丢弃成垃圾
         * 造成频繁的创建对象，丢弃对象
         *
         *
         */
        for (int i = 0; i < index; i++) {
            str += "my";
        }
        System.out.println(str);


        /**
         * 优化：
         * 直接new一个StringBuilder对象，
         * 然后append循环体中的常量
         * 这样提高了每个循环中的对象创建和丢弃的性能
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("my");
        for (int i = 0; i < index; i++) {
            stringBuilder.append("my");
        }
        String strResult = stringBuilder.toString();
        System.out.println(strResult);

    }

}