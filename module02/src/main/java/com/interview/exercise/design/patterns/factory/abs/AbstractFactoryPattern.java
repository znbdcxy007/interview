package com.interview.exercise.design.patterns.factory.abs;

import com.interview.exercise.design.patterns.factory.productor.bean.Millk;

/**
 * @describtion 抽象工厂设计模式：是目前使用的模式
 * @author chenpeiqiang
 * @date 2019/03/05
 */
public abstract class AbstractFactoryPattern {

    /**
     * 生产产品的公共的操作
     */
    private void doCommon(){
        System.out.println("这里是生产对象的工厂，我是该工厂中生产对象操作里公共的操作步骤！");
    }

    /**
     * 蒙牛
     */
    public abstract Millk mengNiu();

    /**
     * 伊利
     */
    public abstract Millk yiLi();

    /**
     * 特仑苏
     */
    public abstract Millk teLunSu();


}