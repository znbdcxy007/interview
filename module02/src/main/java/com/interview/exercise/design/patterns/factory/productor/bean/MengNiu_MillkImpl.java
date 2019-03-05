package com.interview.exercise.design.patterns.factory.productor.bean;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/05
 */
public class MengNiu_MillkImpl implements Millk {

    @Override
    public void getMilk() {
        System.out.println("蒙牛牛奶");
    }
}