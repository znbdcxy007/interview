package com.interview.exercise.design.patterns.factory.bean;

import com.interview.exercise.design.patterns.factory.bean.feature.RefrigeratorInterface;

/**
 * @author chenpeiqiang
 * @describtion 冰箱
 * @date 2019/03/10
 */
public class Refrigerator implements RefrigeratorInterface {

    /**
     * 产品名称
     */
    private String door;

    /**
     * 品牌名
     */
    private String brand;

    /**
     * 创建对象需要得初始化操作，
     * 设置线缆介质
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 设置冰箱具体形态
     * @param door
     */
    @Override
    public void setDoor(String door) {
        this.door = door;
    }

    /**
     * 通用行为：使用具体形态
     */
    @Override
    public void doWork(){

        System.out.println(brand+"="+door+":保存食物！");

    }

}