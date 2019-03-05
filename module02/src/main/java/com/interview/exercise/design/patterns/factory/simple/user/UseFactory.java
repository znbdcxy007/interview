package com.interview.exercise.design.patterns.factory.simple.user;

import com.interview.exercise.design.patterns.factory.productor.bean.Millk;
import com.interview.exercise.design.patterns.factory.simple.SimpleFactoryPattern;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/05
 */
public class UseFactory {

    public static void main( String[] args ){
        /**
         * 获取工厂对象，通过工厂对象获取目标对象
         * 弊端：获取对象时需要传入数据，增加了程序错误的可能性
         */
        SimpleFactoryPattern simpleFactoryPattern = new SimpleFactoryPattern();

        //蒙牛对象
        Millk productMengNiu = simpleFactoryPattern.getProductor("蒙牛");
        productMengNiu.getMilk();

        //伊利对象
        Millk productYiLi = simpleFactoryPattern.getProductor("伊利");
        productYiLi.getMilk();

        //特仑苏
        Millk productTeLunSu = simpleFactoryPattern.getProductor("特仑苏");
        productTeLunSu.getMilk();
    }

}