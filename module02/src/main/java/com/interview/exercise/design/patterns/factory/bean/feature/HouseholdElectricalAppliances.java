package com.interview.exercise.design.patterns.factory.bean.feature;

/**
 * @author chenpeiqiang
 * @describtion
 * @date 2019/03/10
 */
public interface HouseholdElectricalAppliances {

    /**
     * 电器品牌
     * @param brand
     */
    void setBrand(String brand);

    /**
     * 家电开始工作
     */
    void doWork();


}