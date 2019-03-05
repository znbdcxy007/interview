package com.interview.exercise.design.patterns.factory.function;

import com.interview.exercise.design.patterns.factory.productor.bean.Millk;

/**
 * 工厂方法设计模式
 * 弊端：每增加一个类，就需要新定义一个工厂类来生产该对象
 */
public interface FunctionFactoryPattern {

    /**
     * 创建对象的工厂接口
     */
     Millk getProduct();

}
