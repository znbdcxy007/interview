package com.interview.exercise.design.patterns.factory.bean;

import com.interview.exercise.design.patterns.factory.bean.feature.WasherInterface;

/**
 * @author chenpeiqiang
 * @describtion 洗衣机
 * @date 2019/03/10
 */
public class Washer implements WasherInterface {

    /**
     * 产品名称
     */
    private String bucket;

    /**
     * 品牌名称
     */
    private String brand;

    /**
     * 创建对象需要得初始化操作
     * 设置线缆介质
     * @param brand
     */
    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * 通用行为：使用具体状态
     */
    @Override
    public void doWork(){
        System.out.println(brand+"="+bucket+"：洗衣服");
    }

}