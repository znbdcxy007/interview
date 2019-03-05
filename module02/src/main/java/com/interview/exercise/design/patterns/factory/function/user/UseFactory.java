package com.interview.exercise.design.patterns.factory.function.user;

import com.interview.exercise.design.patterns.factory.function.FunctionFactoryPattern;
import com.interview.exercise.design.patterns.factory.function.MengNiu_FunctionFactoryPatternImpl;
import com.interview.exercise.design.patterns.factory.function.TeLunSu_FunctionFactoryPatternImpl;
import com.interview.exercise.design.patterns.factory.function.YiLi_FunctionFactoryPatternImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.Millk;

/**
 * @describtion 工厂方法
 * @author chenpeiqiang
 * @date 2019/03/05
 */
public class UseFactory {
    public static void main( String[] args ){
        /**
         * 工厂方法设计模式
         * 弊端：需要知道并且获取指定的工厂对象，才能通过具体的工厂对象获得对应的产品对象
         */

        /**
         * 得到蒙牛工厂，
         * 通过蒙牛工厂得到蒙牛产品对象
         */
        FunctionFactoryPattern mengNiu_functionFactoryPattern = new MengNiu_FunctionFactoryPatternImpl();
        Millk productMengNiu = mengNiu_functionFactoryPattern.getProduct();
        productMengNiu.getMilk();

        /**
         * 得到伊利工厂
         * 通过伊利工厂得到伊利产品对象
         */
        FunctionFactoryPattern yiLI_functionFactoryPattern = new YiLi_FunctionFactoryPatternImpl();
        Millk productYiLi = yiLI_functionFactoryPattern.getProduct();
        productYiLi.getMilk();

        /**
         * 得到特仑苏工厂
         * 通过特仑苏工厂得到特仑苏产品对象
         */
        FunctionFactoryPattern teLunSu_functionFactoryPattern = new TeLunSu_FunctionFactoryPatternImpl();
        Millk productTeLunSu = teLunSu_functionFactoryPattern.getProduct();
        productTeLunSu.getMilk();
    }

}