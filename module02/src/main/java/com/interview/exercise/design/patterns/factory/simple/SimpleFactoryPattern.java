package com.interview.exercise.design.patterns.factory.simple;

import com.interview.exercise.design.patterns.factory.productor.bean.MengNiu_MillkImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.Millk;
import com.interview.exercise.design.patterns.factory.productor.bean.TeLunSu_MillkImpl;
import com.interview.exercise.design.patterns.factory.productor.bean.YiLi_MillkImpl;

/**
 * @describtion 简单工厂模式
 * @author chenpeiqiang
 * @date 2019/03/05
 */
public class SimpleFactoryPattern {

    /**
     * 生产产品
     * 弊端：每增加一个类，都需要来修改源码，对原有业务就有可能造成风险
     */
    public Millk getProductor(String name){

        if(name.equals("蒙牛")){
            return new MengNiu_MillkImpl();
        }
        else if(name.equals("伊利")){
            return new YiLi_MillkImpl();
        }
        else if(name.equals("特仑苏")){
            return new TeLunSu_MillkImpl();
        }
        else{
            System.out.println("没有这个对象");
            return null;
        }
    }
}