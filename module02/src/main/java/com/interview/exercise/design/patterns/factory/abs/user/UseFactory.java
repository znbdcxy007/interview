package com.interview.exercise.design.patterns.factory.abs.user;

import com.interview.exercise.design.patterns.factory.abs.AbstractFactoryPattern;
import com.interview.exercise.design.patterns.factory.abs.AbstractFactoryPatternImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.Millk;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/05
 */
public class UseFactory {
    public static void main( String[] args ){

        /**
         * 获取工厂对象
         * 优点：
         * A、用户选取对象，减少了程序的错误率
         * B、新增加的产品对象，用户直接使用原有工厂对象就可以获取，
         * C、修改工厂方法，用户也不需要修改任何代码就可以无缝切换
         * 弊端：
         * A、需要更新接口
         * B、和简工厂模式不一样，简单工厂需要修改源码，抽象工厂只需要修改接口（添加对新对象的接口支持）
         */
        AbstractFactoryPattern abstractFactoryPattern = new AbstractFactoryPatternImpl();

        /**
         * 通过工厂对象选择需要的产品对象：蒙牛
         */
        Millk productMengNiu = abstractFactoryPattern.mengNiu();
        productMengNiu.getMilk();

        /**
         * 通过工厂对象选择需要的产品对象：特仑苏
         */
        Millk productTeLunSu = abstractFactoryPattern.teLunSu();
        productTeLunSu.getMilk();

        /**
         * 通过工厂对象选择需要的产品对象：伊利
         */
        Millk productYiLi = abstractFactoryPattern.yiLi();
        productYiLi.getMilk();

    }

}