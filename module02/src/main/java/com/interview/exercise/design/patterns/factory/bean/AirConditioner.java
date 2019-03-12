package com.interview.exercise.design.patterns.factory.bean;

import com.interview.exercise.design.patterns.factory.bean.feature.AirConditionerInterface;

/**
 * @author chenpeiqiang
 * @describtion 空调
 * @date 2019/03/10
 */
public class AirConditioner implements AirConditionerInterface {

    /**
     * 品牌
     */
    private String brand;

    /**
     * 空调挂在方式
     */
    private String status;

    /**
     * 创建对象需要得初始化操作，
     * 设置线缆介质
     * @param brand
     */
    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 设置空调具体形态
     * @param status
     */
    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 通用行为：使用具体形态
     */
    @Override
    public void doWork(){
        System.out.println(brand+"="+status +":调节空气温度！");
    }

}