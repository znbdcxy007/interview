package com.interview.exercise.design.patterns.factory.abstr;

import com.interview.exercise.design.patterns.factory.bean.feature.AirConditionerInterface;
import com.interview.exercise.design.patterns.factory.bean.feature.HouseholdElectricalAppliances;
import com.interview.exercise.design.patterns.factory.bean.feature.RefrigeratorInterface;
import com.interview.exercise.design.patterns.factory.bean.feature.WasherInterface;

/**
 * @author chenpeiqiang
 * @describtion 抽象工厂模式
 * @date 2019/03/10
 */
public abstract class AbstractFactory {
    
    /**
     * 家电生产统一操作：设置产品品牌
     */
    public <T extends HouseholdElectricalAppliances> T initWork(T householdElectricalAppliances, String branch){
        householdElectricalAppliances.setBrand(branch);
        return (T)householdElectricalAppliances;
    }

    /**
     * 空调
     */
    public abstract AirConditionerInterface productAirConditioner();

    /**
     * 洗衣机
     */
    public abstract WasherInterface productWasher();

    /**
     * 冰箱
     */
    public abstract RefrigeratorInterface productRefrigerator();

}